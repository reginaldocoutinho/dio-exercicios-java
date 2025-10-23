package br.com.dio.herancaepolimorfismo.exercicio1;

import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        Ingresso meiaEntrada = new MeiaEntrada();
        Ingresso pacoteFamilia = new PacoteFamilia();
        Ingresso inteira = new Inteira();
        String nomeDoFilme = inteira.getNomeDoFilme();
        double valorMeia = meiaEntrada.getValor();
        double valorInteira = inteira.getValor();
        var entrada = new Scanner(System.in);

        System.out.println("Bem vindo a Bilheteria, gostaria de compra ingresso(s)? (s/n)");
        var comprar = entrada.next();

        if(comprar.equalsIgnoreCase("s")) {
            while (comprar.equalsIgnoreCase("s")){
                System.out.println("\n\nBilheteria:" +
                        "\n0 - Sair" +
                        "\n1 - Inteira" +
                        "\n2 - meia entrada" +
                        "\n3 - Pacote Família" +
                        "\n\n(adquirindo um pacote família e adicionando mais de 3 pessoas " +
                        "ganha um desconto de 5% ");
                var option = entrada.nextInt();
                switch (option) {
                    case 0:
                        comprar = "n";
                        break;
                    case 1:
                        System.out.println("Deseja Assistir dublado ou legendado?(d/l)");
                        var escolha = entrada.next();
                        inteira.definirTipoExibicao(escolha);
                        String tipoExibicao = inteira.getTipoExibicao();
                        System.out.printf("Você adquiriu um ingresso" +
                                "\npara o Filme: %s " +
                                "\nTipo de exibição: %s" +
                                    "\nvalor de %.2f reais", nomeDoFilme, tipoExibicao, valorInteira);
                        break;
                    case 2:
                        System.out.println("Deseja Assistir dublado ou legendado?(d/l)");
                        var escolhaMeia = entrada.next();
                        meiaEntrada.definirTipoExibicao(escolhaMeia);
                        String tipoExibicaoMeia = meiaEntrada.getTipoExibicao();
                        System.out.printf("Você adquiriu um ingresso" +
                                "\npara o Filme: %s " +
                                "\nTipo de exibição: %s" +
                                "\nvalor de %.2f reais", nomeDoFilme, tipoExibicaoMeia, valorMeia);
                        break;
                    case 3:
                        System.out.println("Deseja comprar quantos ingressos?");
                        var qtdIngresso = entrada.nextInt();
                        if(pacoteFamilia instanceof PacoteFamilia)((PacoteFamilia) pacoteFamilia).calcularValor(qtdIngresso);
                        System.out.println("Deseja Assistir dublado ou legendado?(d/l)");
                        var escolhaFamilia = entrada.next();
                        meiaEntrada.definirTipoExibicao(escolhaFamilia);
                        String tipoExibicaoFamilia = meiaEntrada.getTipoExibicao();
                        double valorPctFamilia = pacoteFamilia.getValor();
                            System.out.printf("Você adquiriu um ingresso" +
                                    "\npara o Filme: %s " +
                                    "\nTipo de exibição: %s" +
                                    "\nvalor de %.2f reais", nomeDoFilme, tipoExibicaoFamilia, valorPctFamilia);
                        break;
                }
            }
        }else if(comprar.equalsIgnoreCase("n")){
            System.out.println("Até a próxima!");
        }else {
            System.out.println("Resposta invalida!");
        }
    }
}

