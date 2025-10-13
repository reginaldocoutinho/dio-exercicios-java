package br.com.dio.estruturacontrole.estruturacondicional;

import java.util.Scanner;

public class CondicaoSE {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        var name = entrada.next();
        System.out.println("Informe sua idade: ");
        var age = entrada.nextInt();


        if (age >= 65){
            System.out.println("Você ja está aposentado?(s/n)");
            var aposentado = "s".equalsIgnoreCase(entrada.next());
            if(aposentado){
                System.out.println("Você tem mais de 65 anos e já está aposentado!");
            }else{
                System.out.println("Você tem mais de 65 anos, mas ainda não se aposentou!");
            }
        }else if (age > 18){
            System.out.printf("%s, você está com %s anos e já é maior de idade!", name, age);
        }else{
            System.out.println("Você é menor de idade!");
        }
    }
}

