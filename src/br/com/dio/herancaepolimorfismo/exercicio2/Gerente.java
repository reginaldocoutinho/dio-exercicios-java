package br.com.dio.herancaepolimorfismo.exercicio2;

public class Gerente extends FuncionarioDeVendas{

    public Gerente() {
        // define valores padrão no construtor
        this.nome = "Reginaldo Coutinho";
        this.email = "reginaldo.coutinho@hotmail.com";
        this.senha = "1234";
        this.flagAdministrador = true;
        this.tipoDeUsuario="gerente";
    }

    public void gerarRelatorio(){
        System.out.println("Relatório Gerado!");
    }


}
