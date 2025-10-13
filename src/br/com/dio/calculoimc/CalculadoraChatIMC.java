package br.com.dio.calculoimc;

import java.util.Scanner;

public class CalculadoraChatIMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Calculadora de IMC ===");

        // Entrada de dados
        System.out.print("Digite seu peso (kg): ");
        double peso = sc.nextDouble();

        System.out.print("Digite sua altura (m): ");
        double altura = sc.nextDouble();

        // Cálculo do IMC
        double imc = peso / (altura * altura);

        // Exibição com 2 casas decimais
        System.out.printf("Seu IMC é %.2f%n", imc);

        // Classificação do IMC
        if (imc < 17) {
            System.out.println("Classificação: Abaixo do peso 😕");
        } else if (imc < 25) {
            System.out.println("Classificação: Peso normal 😊");
        } else if (imc < 30) {
            System.out.println("Classificação: Sobrepeso ⚠️");
        } else if (imc < 35) {
            System.out.println("Classificação: Obesidade grau I 🚨");
        } else if (imc < 45) {
            System.out.println("Classificação: Obesidade grau II ⚠️🚨");
        } else {
            System.out.println("Classificação: Obesidade grau III (mórbida) 🛑");
        }

        sc.close();
    }
}
