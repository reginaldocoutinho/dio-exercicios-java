package br.com.dio.calculodearea;

import java.util.Scanner;

public class CalcAreaQuadrado {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        System.out.println("Calculo de area do quadrado");
        System.out.println("Qual o comprimento de um dos lado do quadrado?");
        var medidaLadoQuadrado = entrada.nextDouble();
        var areaQuadrado = medidaLadoQuadrado * 4;
        System.out.printf(String.valueOf(areaQuadrado));
    }
}