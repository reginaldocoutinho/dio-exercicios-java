package br.com.dio.herancaepolimorfismo.exercicio3;

import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        Relogio relogioBrasileiro = new RelogioBrasileiro();
        Relogio relogioAmericano = new RelogioAmericano();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Configurando o relógio");
        System.out.println("Hora atual: ");
        int hora = entrada.nextInt();
        System.out.println("Digite minutos atuais: ");
        int minutos = entrada.nextInt();
        System.out.println("Digite segundos atuais: ");
        int segundos = entrada.nextInt();
        System.out.println("Deseja utilizar o relógio brasileiro ou americano?(b/a)");
        var tipo = entrada.next();
        if(tipo.equalsIgnoreCase("b")){
            relogioBrasileiro.retornaRelogio(hora, minutos, segundos);
        }else if(tipo.equalsIgnoreCase("a")){
            relogioAmericano.retornaRelogio(hora, minutos, segundos);
        }else{
            System.out.println("Opção inválida!");
        }



    }


}
