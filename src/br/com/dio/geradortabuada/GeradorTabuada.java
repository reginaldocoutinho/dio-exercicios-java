package br.com.dio.geradortabuada;
import java.util.Scanner;
public class GeradorTabuada {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        System.out.println("Gerador de Tabuada" +
                "\nDigite o número da tabuada desejada:");
        var numero = entrada.nextInt();
        var i = 0;
        for(i = 1; i <= 10; i++){
            var resultado = numero * i;
            System.out.printf("\n%s x %s = %s",numero, i, resultado);
        }

    }
}
