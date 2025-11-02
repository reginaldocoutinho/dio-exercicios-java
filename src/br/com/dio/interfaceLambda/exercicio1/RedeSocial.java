package br.com.dio.interfaceLambda.exercicio1;

public class RedeSocial implements EnvioMensagem{
    @Override
    public void enviar(String mensagem){
        System.out.println("Enviando por Rede Social: "+ mensagem);
    }
}
