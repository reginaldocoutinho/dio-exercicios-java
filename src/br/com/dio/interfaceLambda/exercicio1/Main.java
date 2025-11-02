package br.com.dio.interfaceLambda.exercicio1;

import java.util.Scanner;

public class Main {
    private final static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args){
        String msg = "Alerta: Chuva por todo o fim de semana";
        System.out.println("Envio de Mensagem");

        //canais oficiais
        EnvioMensagem sms = new Sms();
        EnvioMensagem email = new Email();
        EnvioMensagem whatsapp = new Whatsapp();
        EnvioMensagem redeSocial = new RedeSocial();

        //canais dinamicos(lambda)
        EnvioMensagem telegram = m-> System.out.println("Enviando por Telegram: " + m);


        sms.enviar(msg);
        email.enviar(msg);
        whatsapp.enviar(msg);
        redeSocial.enviar(msg);
        telegram.enviar(msg);

    }

}
