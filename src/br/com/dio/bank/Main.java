package br.com.dio.bank;
import java.sql.SQLOutput;
import java.util.Scanner;




public class Main {

    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var account = new BankAccount("Coutinho", 1000);

        System.out.println("Bem vindo a sua conta " + account.getAccountOwner());
        System.out.println("=======================");
        var options = 0;
        while (options != 8) {
            System.out.printf("\nOverdraft: %.2f\nBalance: %.2f", account.getOverdraft(), account.getBalance());
            System.out.println("\nOptions:"
                    +
                    "\n1 - Check Balance"
                    +
                    "\n2 - Deposit Money"
                    +
                    "\n3 - Withdraw Money"
                    +
                    "\n4 - Pay a Bill"
                    +
                    "\n5 - Overdraft"
                    +
                    "\n6 - Check Overdraft"
                    +
                    "\n7 - Pay Overdraft"
                    +
                    "\n8 - Exit");
            System.out.println("=======================");
            System.out.println("\nTo continue, choose one of the options above:");
            options = input.nextInt();

            switch (options) {
                case 1:
                    System.out.printf("Your current balance is %.2f reais.", account.getBalance());
                    account.discountCheck();
                    break;
                case 2:
                    System.out.println("Please enter the deposit amount:");
                    var deposit = input.nextDouble();

                    account.depositMoney(deposit);
                    System.out.println(account.getBalance());
                    break;
                case 3:
                    System.out.println("Please enter the withdraw amount:");
                    var withdraw = input.nextDouble();
                    account.withdrawCash(withdraw);
                    System.out.println(account.getBalance());
                    break;
                case 4:
                    System.out.println("Please enter the barcode:");
                    var bill = input.next();
                    System.out.println("Enter the amount:");
                    var amount = input.nextDouble();
                    System.out.println("Do you want to pay the bill \""
                            + bill +
                            "\" in the amount of "
                            + amount +
                            " reais? (y/n)");
                    var check = input.next().trim();
                    if(check.equalsIgnoreCase("y") || check.equalsIgnoreCase("yes")){
                        account.payBill(amount);
                        System.out.println("Payment completed successfully, your balance is " + account.getBalance() + " reais");
                    }else{
                        System.out.println("Operation closed, your balance is " + account.getBalance() +" reais");
                    }
                    break;
                case 5:
                    if(account.getOverdraft() > 0) {
                        System.out.println("Do you want to use the overdraft?(y/n)");
                        var checkOverdraft = input.next().trim();
                        if (checkOverdraft.equalsIgnoreCase("y") || checkOverdraft.equalsIgnoreCase("yes")) {
                            System.out.println("Enter the amount to be used from the overdraft: ");
                            var overdraftValue = input.nextDouble();
                            account.useOverDraft(overdraftValue);
                        }
                    }else{
                        System.out.println("You do not have sufficient funds to use the overdraft! balance: "+ account.getOverdraft());
                    }
                    break;
                case 6:
                    var overdraft = account.getOverdraft();
                    System.out.printf("\nOverdraft available limit: %.2f", overdraft);
                    break;
                case 7:
                    if(account.getOverdraft() < account.initialOverdraft) {
                        System.out.printf("Overdraft value %.2f, Do you want to pay the full overdraft amount or a part of the overdraft amount?(full/part)", account.getUsedOverdraft());
                        var choice = input.next();
                        if (choice.equalsIgnoreCase("full")) {
                            account.payOverdraft("full", 0);
                        } else if (choice.equalsIgnoreCase("part")) {
                            System.out.println("Enter the amount you wish to pay towards the overdraft: ");
                            var partialValue = input.nextDouble();
                            account.payOverdraft("part", partialValue);
                        } else {
                            System.out.println("Invalid Opcion!\nexit!");
                            break;
                        }
                        System.out.printf("\nOverdraft Balance: %.2f Account Balance: %.2f", account.getOverdraft(), account.getBalance());
                    } else {
                        System.out.println("No outstanding overdraft balance!");
                    }
                    break;
                case 8:
                    System.out.println("See you later!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.!");
            }
        }
    }
}
