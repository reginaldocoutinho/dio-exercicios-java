package br.com.dio.estruturacontrole.estruturarepeticao;

import java.util.Scanner;

public class RepeticaoDoWhile {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        var name = "";

        do {
            System.out.println("Informe um nome:");
            name = entrada.next();
            System.out.println(name);
        } while (!name.equalsIgnoreCase("exit"));
    }
}
