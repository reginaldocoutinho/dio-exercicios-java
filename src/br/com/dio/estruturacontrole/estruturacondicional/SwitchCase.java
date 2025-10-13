package br.com.dio.estruturacontrole.estruturacondicional;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        System.out.println("Dias da semana:" +
                "\n1:Domingo | 2:Segunda-Feira | 3:Terça-Feira | 4:Quarta-Feira " +
                "\n5:Quinta-Feira | 6:Sexta-Feira | 7:Sabado" +
                "\nInforme um número de 1 até 7:");
        var option = entrada.nextInt();
        switch (option) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3:
                System.out.println("Terça-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Opção Inválida!");
    }

}
}
