package br.com.dio.herancaepolimorfismo.exercicio2;

public non-sealed class Atendente extends Colaborador{
    private double valorCaixa;
    private double valorFinal;

    //Construtor
    public Atendente() {
        // define valores padrão no construtor
        this.nome = "Carla Sousa";
        this.email = "carla.sousa@hotmail.com";
        this.senha = "1234";
        this.flagAdministrador = false;
        this.tipoDeUsuario = "atendente";
    }

    public double getValorCaixa(){
        return valorCaixa;
    }

    public void setValorCaixa(double valorCaixa){
        this.valorCaixa = valorCaixa;
    }

    public void setValorFinal(double valor){
        this.valorFinal = valor;
    }

    public void receberPagamento(double pagamento){
        var caixa = getValorCaixa()+pagamento;
        setValorCaixa(caixa);
        System.out.printf("\nValor recebido de %s reais e o " +
                "\n valor do caixa: %s reais",pagamento, caixa);
    }

    public void fecharCaixa(double valor){
        double fechamentoCaixa = valor - getValorCaixa();
        setValorFinal(fechamentoCaixa);
        if(fechamentoCaixa < 0){
            System.out.println("\nFoi realizado o fechamento do caixa com um valor negativo!"+
                    "\n" +fechamentoCaixa+" reais" );
        }else{
            System.out.println("\nFechamento realizado com sucesso, saldo: "+ fechamentoCaixa + " reais");
        }
    }
}
