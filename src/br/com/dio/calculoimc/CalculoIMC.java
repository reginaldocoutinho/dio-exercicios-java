package br.com.dio.calculoimc;
import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        System.out.println("Calculadora de IMC" +
                "\n------------------");
        System.out.println("Digite a altura:");
        var altura = entrada.nextDouble();

        System.out.println("Digite o peso:");
        var peso = entrada.nextDouble();

        var resultado = peso / (altura * altura);

        if (resultado <= 18.5) {
            System.out.printf("Seu peso é %.2f e você se encontra abaixo do peso!", resultado);
        } else if (resultado >= 18.6 && resultado <= 24.9) {
            System.out.printf("Seu peso é %.2f e você se encontra no peso ideal!", resultado);
        } else if (resultado >= 25.0 && resultado <= 29.9) {
            System.out.printf("Seu peso é %.2f e você se encontra um pouco acima do peso!", resultado);
        } else if (resultado >= 30.0 && resultado <= 34.9) {
            System.out.printf("Seu peso é %.2f e você se encontra com obesidade grau I!", resultado);
        } else if (resultado >= 35.0 && resultado <= 39.9) {
            System.out.printf("Seu peso é %.2f e você se encontra com obesidade grau II(SEVERA)!", resultado);
        } else if (resultado > 40.0) {
            System.out.printf("Seu peso é %.2f e você se encontra com obesidade grau III(Mórbida)!", resultado);
        }

    }
}