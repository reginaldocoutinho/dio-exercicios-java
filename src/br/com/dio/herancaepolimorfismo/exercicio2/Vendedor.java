package br.com.dio.herancaepolimorfismo.exercicio2;

public class Vendedor extends FuncionarioDeVendas{

    public Vendedor() {
        // define valores padrão no construtor
        this.nome = "Felipe Gouveia";
        this.email = "felipe.gouveia@hotmail.com";
        this.senha = "1234";
        this.flagAdministrador = false;
        this.tipoDeUsuario = "vendedor";
    }



}
