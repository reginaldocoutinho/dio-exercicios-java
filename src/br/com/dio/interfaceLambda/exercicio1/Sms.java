package br.com.dio.interfaceLambda.exercicio1;

public class Sms implements EnvioMensagem {
    @Override
    public void enviar(String mensagem){
        System.out.println("Enviando por SMS: "+ mensagem);
    }
}
