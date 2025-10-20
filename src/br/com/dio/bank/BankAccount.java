package br.com.dio.bank;
import java.io.IOException;
import java.io.*;
import java.util.concurrent.atomic.AtomicBoolean;


public class BankAccount implements Serializable {
    private String accountOwner;
    private double balance;
    public double overdraft;
    public double initialOverdraft;
    public double usedValueOverdraft;
    AtomicBoolean flagUsedOverdraft = new AtomicBoolean(false);

    //construtor
    public BankAccount(String name, double initialBalance){

        this.accountOwner = name;
        this.balance = initialBalance;
        double value = 0;
            if (balance <= 500){
                value = 50;
                this.overdraft = value;
            }else if (balance > 500 ){
                value = balance / 2;
                this.overdraft = value;

            }
            this.initialOverdraft = value;
    }

    public String getAccountOwner(){
        return accountOwner;
    }

    public Double getBalance(){
        return balance;
    }
    public Double getOverdraft(){
        return overdraft;
    }

    public Double getUsedOverdraft(){
        return usedValueOverdraft;
    }
    public Double getInitialOverdraft(){
        return initialOverdraft;
    }
    public void depositMoney(Double value) {

        if(value > 0){
            balance += value;
        }else{
            System.out.println("Invalid amount for deposit");
        }

    }

    public void withdrawCash(Double value){
        if(balance >= value) {
            balance -= value;
        }else {
            System.out.println("Insufficient balancee!");
        }

    }

    public void payBill(Double value){
        if(value > 0) {
            balance -= value;
        }else{
            System.out.println("Invalid amount!");
        }
    }

    public void payOverdraft(String decision, double partialAmount){
        if(balance > overdraft) {
            if (decision.equalsIgnoreCase("full")) {
                if (overdraft > 0) {
                    balance = balance - usedValueOverdraft;
                } else {
                    balance = balance - initialOverdraft;
                }
                if (balance <= 500) {
                    overdraft = 50;
                } else if (balance > 500) {
                    overdraft = balance / 2;
                }
            } else if (decision.equalsIgnoreCase("part")) {
                balance = balance - partialAmount;
                overdraft = overdraft + partialAmount;
            } else {
                System.out.println("Invalid amount!");
            }
        }else{
            System.out.println("Insufficient funds " + balance + "reais");
        }
    }

    public void useOverDraft(Double value){
        if(value == null || value <= 0){
            System.out.println("Valor inválido");
            return;
        }
        if (overdraft < value){
            System.out.println("Limite insuficente");
        }else{
            this.overdraft -= value;
            this.usedValueOverdraft = this.usedValueOverdraft + value;
            this.flagUsedOverdraft.set(true);

            // crédito entra no saldo
            this.balance += value;
            System.out.printf("\nThe amount used from the overdraft was %.2f reais, " +
                    "and the current account balance is %.2f reais",value, this.balance);
            // persista todos afetados
        }
    }

    public void discountCheck(){
        if(flagUsedOverdraft.get() && balance > 0 && usedValueOverdraft > 0) {
            double taxa = 0.20; //20%
            double desconto = usedValueOverdraft * taxa;

            // só desconte até o saldo disponível
            double aplicado = Math.min(desconto, balance);
            this.balance -= aplicado;

            // se quiser encerrar a "flag de uso"
            this.flagUsedOverdraft.set(false);
            System.out.printf("\n\nCobrado o valor de %.2f aplicado (20%% de %.2f).%n", aplicado, this.usedValueOverdraft);
        }
        else
        {
            System.out.println("\n\nNenhum desconto aplicável.");
        }

    }
}
