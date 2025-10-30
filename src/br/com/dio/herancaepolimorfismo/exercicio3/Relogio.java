package br.com.dio.herancaepolimorfismo.exercicio3;

public sealed  abstract class Relogio permits RelogioBrasileiro, RelogioAmericano {

    public abstract void retornaRelogio(int hora, int minutos,int segundos);

}
