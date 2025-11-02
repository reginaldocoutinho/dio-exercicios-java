    package br.com.dio.interfaceLambda.exercicio2;

    import java.util.Scanner;

    public class Main {

        static final Scanner entrada = new Scanner(System.in);

        public static void main(String[] args){
            Tributavel alimento = new Alimentacao();
            System.out.println("Tributação de produtos");
            int option = -1;
            while(option != 0){
                System.out.println("\nMenu:" +
                        "\n0 - Sair" +
                        "\n1 - Alimento" +
                        "\n2 - Bem estar e saúde" +
                        "\n3 - Vestuário" +
                        "\n4 - Cultura");

                option = entrada.nextInt();

                switch (option){
                    case 0:
                        System.out.println("Saiu!");
                        break;
                    case 1:
                        recebeValorProduto(alimento);
                        break;
                    case 2:
                        Tributavel bemEstarSaude = valor -> valor * 0.015;
                        recebeValorProduto(bemEstarSaude);
                        break;
                    case 3:
                        Tributavel vestuario = valor -> valor * 0.025;
                        recebeValorProduto(vestuario);
                        break;
                    case 4:
                        Tributavel cultura = valor -> valor * 0.04;
                        recebeValorProduto(cultura);
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }

            }
        }

        //Método utilitário estático
        public static void recebeValorProduto(Tributavel tributavel){
            System.out.println("Digite o valor do produto: ");
            double valorProduto = entrada.nextDouble();
            double valorImpostoProduto = 0;
            valorImpostoProduto = tributavel.calcularTributo(valorProduto);
            if(valorImpostoProduto > 1) {
                System.out.printf("Valor de imposto do produto %.2f reais", valorImpostoProduto);
            }else{
                System.out.printf("Valor de imposto do produto %.2f centavos", valorImpostoProduto);
            }
        }
    }
