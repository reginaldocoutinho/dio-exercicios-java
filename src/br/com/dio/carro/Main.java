package br.com.dio.carro;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        var entrada = new Scanner(System.in);
        var carro = new Carro();
        boolean sairCarro = false;
        while(sairCarro == false) {
            var estado = carro.getFlagCarroLigado() ? "Ligado" : "Desligado";
            var velocidade = carro.getVelocidade();
            var marcha = carro.getMarcha();
            var direcao = carro.getDirecao();
            var freioDeMao = carro.getFlagFreioEstacionario() ? "Ativado" : "Desativado";
            System.out.println("========================");
            System.out.println("\n\nVocê está dentro do carro" +
                    "\nEstado atual do carro:"+ estado +
                    "\nVelocidade: "+ velocidade +"km/h" +
                    "\nMarcha:"+marcha+
                    "\nDirecao:"+direcao+
                    "\nFreio de mao:"+freioDeMao+
                    "\n\n");

            System.out.println(
                    "\n0 - Sair do carro"+
                    "\n1 - Ligar o carro" +
                    "\n2 - Desligar o carro" +
                    "\n3 - Freio estacionário" +
                    "\n4 - Engatar Marcha(" +
                    " 0, 1, 2, 3, 4, 5, 6)"+
                    "\n5 - Acelerar" +
                    "\n6 - Desacelerar" +
                    "\n7 - Direcao"+
                    "\n Qual ação deseja tomar?");

            var opcao = entrada.nextInt();
            switch (opcao) {
                case 0:
                    carro.setFlagCarroLigado(false);
                    sairCarro = true;
                    System.out.println("Você desligou e saiu do carro!");
                    break;
                case 1:
                    if(carro.getFlagCarroLigado() == false){
                        carro.setFlagCarroLigado(true);
                        System.out.println("O carro ligou!");
                    }else{
                        System.out.println("O carro já está ligado!");
                    }
                    break;
                case 2:
                    if(marcha == 0){
                        if(carro.getFlagCarroLigado() == true){
                            carro.setFlagCarroLigado(false);
                        }else{
                            System.out.println("O carro já está desligado!");
                        }
                    }else{
                        System.out.println("Para desligar o carro selecione o ponto morto!");
                    }
                    break;
                case 3:
                    if(freioDeMao.equalsIgnoreCase("ativado")){
                        carro.setFlagFreioEstacionario(false);
                        System.out.println("Desceu o freio de mão!");
                    }else{
                        carro.setFlagFreioEstacionario(true);
                        System.out.println("Puxou o freio de mão!");
                    }


                    break;
                case 4:
                    System.out.println("Selecione a marcha desejada:");
                    int marchaSelecionada = entrada.nextInt();
                        carro.setTrocarMarcha(marchaSelecionada);
                    break;
                case 5:
                    carro.setPotenciometro("acelerar");
                    break;
                case 6:
                    carro.setPotenciometro("desacelerar");
                    break;
                case 7:
                    System.out.println("Indique uma direção(Esquerda/Direita/Reto)");
                    String escolhaDirecao = entrada.next();
                    carro.setDirecao(escolhaDirecao);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }

    }
}
