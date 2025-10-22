package br.com.dio.petshop;

public class MaquinaDeBanho {
    private double nivelAgua = 0;
    private double nivelShampoo = 0;
    private double nivelMaxAgua = 30;
    private double nivelMaxShampoo = 10;
    private boolean flagMaquinaOcupada = false;
    private boolean flagMaquinaSuja = false;
    private boolean flagEmUso = false;

    public boolean getFlagEmUso(){
        return flagEmUso;
    }

    public boolean getFlagMaquinaOcupada(){
        return flagMaquinaOcupada;
    }
    public boolean getFlagMaquinaSuja(){
        return flagMaquinaSuja;
    }
    public double getNivelAgua(){
        return nivelAgua;
    }
    public double getNivelShampoo(){
        return nivelShampoo;
    }

    public void setFlagEmUso(boolean valor){
        this.flagEmUso = valor;
    }

    public void setNivelAgua(double valor){
        if(nivelAgua < nivelMaxAgua){
            System.out.println("Você colocou 2l de água.");
            this.nivelAgua += valor;
        }else{
            System.out.println("Reservatório de água está cheio.");
        }

    }

    public void setNivelShampoo(double valor){
        if(nivelShampoo < nivelMaxShampoo){
            System.out.println("Voce colocou 2l, serve para um banho.");
            this.nivelShampoo += valor;
        }else{
            System.out.println("Reservatório de shampoo está cheio.");
        }

    }

    public void setFlagMaquinaOcupada(boolean flagMaquinaOcupada) {
        this.flagMaquinaOcupada = flagMaquinaOcupada;
    }

    public void setFlagMaquinaSuja(boolean flagMaquinaSuja){
        this.flagMaquinaSuja = flagMaquinaSuja;
    }


    public void darBanho(double addnivelAgua, double addnivelShampoo ){
        setFlagMaquinaOcupada(true);
        setFlagMaquinaSuja(true);
        nivelAgua = addnivelAgua - 10;
        nivelShampoo = addnivelShampoo - 2;
        flagMaquinaSuja = true;
    }

    public void limparMaquina(double nivelAgua, double nivelShampoo){
        this.nivelShampoo = nivelShampoo - 1;
        this.nivelAgua = nivelAgua - 3;
        flagMaquinaSuja = false;
    }

}
