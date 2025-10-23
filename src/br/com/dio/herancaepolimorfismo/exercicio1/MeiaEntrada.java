package br.com.dio.herancaepolimorfismo.exercicio1;

public non-sealed class MeiaEntrada extends Ingresso {

    @Override
    public double getValor() {
        return super.getValor()/2;
    }

    @Override
    public String getNomeDoFilme() {
        return super.getNomeDoFilme();
    }
}
