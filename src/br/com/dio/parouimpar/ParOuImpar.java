package br.com.dio.parouimpar;

import java.util.Objects;
import java.util.Scanner;

public class ParOuImpar {

    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        System.out.println("Descubra os números que são pares ou ímpares de um período selecionado:");
        System.out.println("Informe o numero inicial:");
        var primeiroNumero = entrada.nextInt();
        System.out.println("Informe o numero final:");
        var segundoNumero = entrada.nextInt();
        var i = 0;
        System.out.println("Escolha entre par ou impar" +
                "\n digite par ou impar");
        var escolha = entrada.next();
        var resultado = 0;
        var resto = 0;
        switch(escolha){
            case "par":
                System.out.printf("Numeros pares de %s a %s \n",primeiroNumero, segundoNumero);
                for(i = primeiroNumero; i <= segundoNumero; i++){
                    resto = i%2;
//                    System.out.printf("\n%s x %s = %s", i, 2, resto);
                    if(resto == 0){
                        System.out.println(i);
                    }
                }
                break;
            case "impar":
                System.out.printf("Numeros ímpares de %s a %s\n",primeiroNumero, segundoNumero);
                for(i = primeiroNumero; i <= segundoNumero; i++){
                    resto = i%2;
//                    System.out.printf("\n%s x %s = %s", i, 2, resto);
                    if(resto != 0){
                        System.out.println(i);
                    }
                }
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}
