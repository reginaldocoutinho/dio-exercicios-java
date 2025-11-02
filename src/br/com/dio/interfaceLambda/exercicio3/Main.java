package br.com.dio.interfaceLambda.exercicio3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        CalculoArea1D quadrado = new Quadrado();
        System.out.println("Calculadora de area");
        int option = -1;
        while(option !=0){
            System.out.println("\n\n***Menu***" +
                    "\nSelecione a figura geométrica desejada" +
                    "\n0 - Sair" +
                    "\n1 - Quadrado" +
                    "\n2 - Retangulo" +
                    "\n3 - Circulo");
            option = entrada.nextInt();
            switch (option){
                case 0:
                    System.out.println("Saiu");
                    break;
                case 1:
                    System.out.println("Digite o comprimento de um dos lados: ");
                    double lado = entrada.nextDouble();
                    double areaQuadrado = quadrado.calcularArea(lado);
                    System.out.printf("O valor da área² do quadrado é: %.2f",areaQuadrado);

                    break;
                case 2:
                    System.out.println("Digite o comprimento da base: ");
                    double base = entrada.nextDouble();
                    System.out.println("Digite a altura: ");
                    double altura = entrada.nextDouble();
                    CalculoArea2D retangulo = (x, y)->x * y;
                    double areaRetangulo = retangulo.calcularArea(base,altura);
                    System.out.printf("A área² do retângulo é: %.2f",areaRetangulo );
                    break;
                case 3:
                    System.out.println("Digite o raio do circulo:");
                    double raio = entrada.nextDouble();
                    CalculoArea1D circulo = valor -> (valor * valor) * 3.14;
                    double areaCirculo = circulo.calcularArea(raio);
                    System.out.printf("A área² do circulo é: %.2f", areaCirculo);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }

    }

}
