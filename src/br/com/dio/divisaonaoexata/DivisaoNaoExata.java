package br.com.dio.divisaonaoexata;

import java.util.Scanner;

public class DivisaoNaoExata {

    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        System.out.println("Informe um número(Inteiro) inicial e tente encontrar um número(Inteiro) " +
                "que o resultado da divisão seja igual diferente de ZERO");
        System.out.println("Digite o número inicial:");
        var numeroInicial = entrada.nextInt();
        int resto = 0;
        while(resto == 0){
            System.out.println("Digite um número:");
            var numero = entrada.nextInt();
            if(numero > numeroInicial){
                resto = numero%numeroInicial;
            }else{
                System.out.printf("Numero precisa ser maior que o inicial %s\n",numeroInicial);
            }
        }
        System.out.println("Parábens!!" +
                "\n Você encontrou um número maior que o inicial e" +
                "\nque o resto da divisão é diferente de 0, sendo assim uma divisão não exata!");
    }
}
