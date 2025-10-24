package br.com.dio.herancaepolimorfismo.exercicio2;

public non-sealed class FuncionarioDeVendas  extends Colaborador{

    protected int qtdVendas;
    public int getQtdVendas(){
        return qtdVendas;
    }

    public void setQtdVendas(int qtdVendas){
        this.qtdVendas = qtdVendas;
    }

    public void realizarVendas(){
        setQtdVendas(getQtdVendas() + 1);
        System.out.println("\nNova venda registrada!");
    }
    public void consultarVendas(){
        System.out.printf("\nQuantidade de vendas: %s", getQtdVendas());
    }
}
