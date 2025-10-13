package br.com.dio.calculodearea;

import java.util.Scanner;

public class CalcAreaRetangulo {

    public static void main(String[] args) {
        /*
        *
        * */
        var entrada = new Scanner(System.in);
        System.out.println("Calculo da área do retangulo");
        System.out.println("Qual o comprimento do retangulo?");
        var comprimento = entrada.nextDouble();
        System.out.println("Qual a altura do retangulo?");
        var altura = entrada.nextDouble();
        var areaRetangulo = comprimento * altura;
        System.out.println(areaRetangulo);
    }

}
