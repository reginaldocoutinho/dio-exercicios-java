package br.com.dio.carro;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Arrays;
import static javax.management.Query.in;

public class Carro {
    private boolean flagCarroLigado = false;
    private boolean flagFreioEstacionario = true;
    private boolean flagCarroEstaEngatado = false;
    private double velocidade;
    private double velocidadeMax = 120;
    private double velocidadeMaxMarcha;
    private int marcha;
    private String direcao = "Reto";

    public boolean getFlagCarroLigado(){
        return flagCarroLigado;
    }
    public boolean getFlagFreioEstacionario(){
        return flagFreioEstacionario;
    }

    public boolean getFlagCarroEstaEngatado(){
        return flagCarroEstaEngatado;
    }

    public int getMarcha(){
        return marcha;
    }

    public double getVelocidade(){
        return velocidade;
    }

    public String getDirecao(){
        return direcao;
    }

    public void setDirecao(String direcao){

        if (direcao.equalsIgnoreCase("esquerda") && velocidade > 1 && velocidade <= 40) {
            this.direcao = "Esquerda";
        } else{
            System.out.println("Para virar a Esquerda o carro precisa estar em movimento!");
        }
        if (direcao.equalsIgnoreCase("direita") && velocidade > 1 && velocidade <= 40) {
            this.direcao = "Direita";
        } else{
            System.out.println("Para virar a Esquerda o carro precisa estar em movimento!");
        }
        if(direcao.equalsIgnoreCase("Reto")){
            this.direcao ="Reto";
        }
    }
    public void setFlagCarroLigado(boolean acao){
        this.flagCarroLigado = acao;
    }

    public void setFlagFreioEstacionario(boolean acao){
        this.flagFreioEstacionario = acao;
    }



    public void setPotenciometro(String acao){

        if(flagCarroLigado == true){
            if(flagFreioEstacionario == false) {
                if (acao.equalsIgnoreCase("acelerar")) {
                    if (marcha == 1) {
                        velocidadeMaxMarcha = Math.max(0, 20);
                        acelerar();
                    } else if (marcha == 2) {
                        velocidadeMaxMarcha = Math.max(21, 40);
                        acelerar();
                    } else if (marcha == 3) {
                        velocidadeMaxMarcha = Math.max(41, 60);
                        acelerar();
                    } else if (marcha == 4) {
                        velocidadeMaxMarcha = Math.max(61, 80);
                        acelerar();
                    } else if (marcha == 5) {
                        velocidadeMaxMarcha = Math.max(81, 100);
                        acelerar();
                    } else if (marcha == 6) {
                        velocidadeMaxMarcha = Math.max(101, 120);
                        acelerar();
                    }

                }
                if (acao.equalsIgnoreCase("desacelerar")) {
                    desacelerar();
                }
            }else{
                System.out.println("solte o freio estacionário");
            }
        }else{
            System.out.println("Ligue o carro!");
        }
    }

    public void setTrocarMarcha(int marchaSelecionada){
        if(flagCarroLigado == true){
            if(marchaSelecionada == 0){
                flagCarroEstaEngatado = false;
                marcha = marchaSelecionada;
                System.out.println("\nCarro está no ponto morto!");
            }else{
                flagCarroEstaEngatado = true;
                marcha = marchaSelecionada;
            }
//            else if(velocidade == 0 && marcha == 0 && marchaSelecionada == 1){
//                flagCarroEstaEngatado = true;
//                marcha = marchaSelecionada;
//            }else{

            }



        }


    public void acelerar(){
         if(velocidade < velocidadeMax){
             velocidade = Math.min( velocidade + 5, velocidadeMaxMarcha);
             if(velocidade == velocidadeMaxMarcha){
                 System.out.printf("\nVelocidade máxima da %sª marcha atingida," +
                         "troque para a próxima: %s \n\n", marcha, marcha+1);
             }
        } else {
            System.out.println("Velocidade máxima de 120km/h atingida!");
        }
    }
    public void desacelerar(){
        if(velocidade <= 5){
            velocidade = Math.max(0, velocidade - 5);
            System.out.println("O carro parou!");
        } else {
            velocidade = velocidade - 5;
        }
    }

}

