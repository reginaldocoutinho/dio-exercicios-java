package br.com.dio.interfaceLambda.exercicio2;

public class Alimentacao implements Tributavel{
    private static final double imposto = 0.01;

    @Override
    public double calcularTributo(double valorProduto){
        return  valorProduto * imposto;
    }
}
