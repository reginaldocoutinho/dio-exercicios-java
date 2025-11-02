package br.com.dio.interfaceLambda.exercicio1;

public class Email implements EnvioMensagem {

    @Override
    public void enviar(String mensagem){
        System.out.println("Enviando por Email: "+ mensagem);
    }
}
