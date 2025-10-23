package br.com.dio.herancaepolimorfismo.exercicio1;

public non-sealed class PacoteFamilia extends Ingresso {
    private int qtdPessoas;
    /* Obs para refatoração futura é necessário considerar
     * que dentro de uma familia iram ter pessoas que iram pagar meia
     * alterando o valor final, e aplicando o desconto.
     * */
    private double desconto = 0.05;

    public int getQtdPessoas() {
        return qtdPessoas;
    }

    public double getDesconto(){
        return desconto;
    }

    public void setQtdPessoas(int qtdPessoas) {
        this.qtdPessoas = qtdPessoas;
        calcularValor(qtdPessoas);
    }

    public void calcularValor(int qtdPessoas){
        desconto = getDesconto();
        double valor;
        if(qtdPessoas >= 3){
            double descontoAplicado = (super.getValor() * qtdPessoas) * desconto;
            valor = (super.getValor() * qtdPessoas) - descontoAplicado;
            super.setValor(valor);
        }else{
            valor = super.getValor() * qtdPessoas;
            super.setValor(valor);
        }


    }

    @Override
    public double getValor(){
        return super.getValor();
    }
}
