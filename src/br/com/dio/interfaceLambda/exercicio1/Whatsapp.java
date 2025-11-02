package br.com.dio.interfaceLambda.exercicio1;

public class Whatsapp implements EnvioMensagem{
    @Override
    public void enviar(String mensagem){
        System.out.println("Enviando por Whatsapp: "+ mensagem);
    }
}
