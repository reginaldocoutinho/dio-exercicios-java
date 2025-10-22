package br.com.dio.petshop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PetShop {

    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        var maquinaDeBanho = new MaquinaDeBanho();
        System.out.println("**Maquina de banho**");
        System.out.println("====================");
        System.out.println("ligada maquina?(s/n)");
        var ligada = entrada.next();
        if(ligada.equalsIgnoreCase("s")){
            while(ligada.equalsIgnoreCase("s")){
                var flagEmUso = maquinaDeBanho.getFlagEmUso() ? "sim" : "nao";
                var nivelAgua = maquinaDeBanho.getNivelAgua();
                var nivelShampoo = maquinaDeBanho.getNivelShampoo();
                var maquinaSuja = maquinaDeBanho.getFlagMaquinaSuja() ? "sim" : "não";
                System.out.println("\nStatus de uso:" +
                        "\nEm uso: "+flagEmUso +
                        "\nNível Agua: "+ nivelAgua +
                        "\nNível Shampoo: "+ nivelShampoo +
                        "\nMaquina suja? "+ maquinaSuja +
                        "\n");
                System.out.println("\n0 -Desligar Maquina" +
                        "\n1 - Colocar Pet" +
                        "\n2 - Retirar Pet" +
                        "\n3 - Dar Banho" +
                        "\n4 - Repor Água" +
                        "\n5 - Repor Shampoo" +
                        "\n6 - Limpar Maquina"+
                        "\nSelecione umas das opções acima");
                var options = entrada.nextInt();
                switch (options){
                    case 0:
                        if(flagEmUso.equalsIgnoreCase("sim")){
                            System.out.println("Retire o pet da maquina!");
                        }else if(maquinaDeBanho.getFlagMaquinaSuja() == true){
                            System.out.println("Maquina suja limpe ela!");
                        }else{
                            ligada = "n";
                            System.out.println("Você parou o processo!");
                        }
                        break;
                    case 1:
                        if(flagEmUso.equalsIgnoreCase("sim")){
                            System.out.println("Maquina já está em uso," +
                                    "\n verifique se o banho terminou e retire o pet");
                        }
                        maquinaDeBanho.setFlagEmUso(true);
                        System.out.println("Colocou um pet na maquina!");
                        break;
                    case 2:
                        if(flagEmUso.equalsIgnoreCase("nao")){
                            System.out.println("Não tem nenhum pet utilizando a maquina!");
                        }else {
                            maquinaDeBanho.setFlagEmUso(false);
                            System.out.println("Retirou o pet da maquina!");
                            if(maquinaDeBanho.getFlagMaquinaSuja() == true){
                                System.out.println("Maquina suja limpe ela!");
                            }
                        }
                        break;
                    case 3:
                        if(flagEmUso.equalsIgnoreCase("sim")){
                            System.out.println("Dar banho?(s/n)");
                            var escolhaBanho = entrada.next();
                            if(escolhaBanho.equalsIgnoreCase("sim") || escolhaBanho.equalsIgnoreCase("s")){
                                if(nivelAgua < 10){
                                    System.out.println("Maquina não possui agua suficiente!\nReponha a agua!");
                                }else if(nivelShampoo < 2){
                                    System.out.println("Maquina não possui shampoo suficiente!\nReponha o shampoo!");
                                }else{
                                    maquinaDeBanho.darBanho(nivelAgua,nivelShampoo);
                                    System.out.println("Chegou");
                                }
                            }else if(escolhaBanho.equalsIgnoreCase("não") || escolhaBanho.equalsIgnoreCase("n")){
                                System.out.println("\nEscolha outra opção\n");
                            }
                        }else{
                            System.out.println("Coloque um pet dentro da maquina para iniciar o processo!");
                        }
                        break;
                    case 4:
                        maquinaDeBanho.setNivelAgua(2);
                        break;
                    case 5:
                        maquinaDeBanho.setNivelShampoo(2);
                        break;
                    case 6:
                        maquinaDeBanho.limparMaquina(nivelAgua,nivelShampoo);
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
            }
        }else if(ligada.equalsIgnoreCase("n")){
            System.out.println("\nMaquina continua desligada!");
        }else{
            System.out.println("Opção inválida!");
        }

    }
}
