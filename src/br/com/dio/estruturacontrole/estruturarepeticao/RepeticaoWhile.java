package br.com.dio.estruturacontrole.estruturarepeticao;

import java.util.Scanner;

public class RepeticaoWhile {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        var name = "";
        while(!name.equals("exit")){
            System.out.println("Informe um nome:");
            name = entrada.next();
            System.out.println(name);
        }
    }
}
