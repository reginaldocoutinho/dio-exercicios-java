package br.com.dio.herancaepolimorfismo.exercicio1;

import java.util.Scanner;

public sealed abstract class Ingresso permits Inteira, PacoteFamilia,MeiaEntrada {
    protected double valor = 20;
    protected String nomeDoFilme = "Todo mundo em pânico X";
    protected boolean flagtipoExibicao;
    protected String tipoExibicao;

    public String getTipoExibicao() {
        return tipoExibicao;
    }

    public void setTipoExibicao(String tipoExibicao) {
        this.tipoExibicao = tipoExibicao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNomeDoFilme() {
        return nomeDoFilme = nomeDoFilme;
    }

    public void setNomeDoFilme(String nomeDoFilme) {
        this.nomeDoFilme = nomeDoFilme;
    }

    public String isTipoExibicao() {
        return tipoExibicao;
    }

    public void setFlagTipoExibicao(boolean flagTipoExibicao) {
        this.flagtipoExibicao = flagTipoExibicao;
        if(flagTipoExibicao){
            setTipoExibicao("Dublado");
        }else{
            setTipoExibicao("Legendado");
        }
    }

    public void definirTipoExibicao(String escolha){
        if (escolha.equalsIgnoreCase("d")) {
            setFlagTipoExibicao(true);
        } else if (escolha.equalsIgnoreCase("l")) {
            setFlagTipoExibicao(false);
        }
    }


}
