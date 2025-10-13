package br.com.dio.estruturacontrole.estruturarepeticao;

import java.util.Scanner;

public class RepeticaoFor {

    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        System.out.println("Digite o limite da contagem:");
        var limite = entrada.nextInt();
        for(var i = 0; i < limite; i+=2){
            System.out.print(" "+i);

       }
    }
}
