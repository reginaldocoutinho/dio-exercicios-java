package br.com.dio.interfaceLambda.exercicio3;

public class Quadrado implements CalculoArea1D {

    @Override
    public double calcularArea(double lado){
        return lado * lado;
    }
}
