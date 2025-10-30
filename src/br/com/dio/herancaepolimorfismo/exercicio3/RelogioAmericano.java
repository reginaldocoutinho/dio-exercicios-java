package br.com.dio.herancaepolimorfismo.exercicio3;

public non-sealed class RelogioAmericano extends Relogio {
    private boolean meridiem;

    public boolean isPeriodo(){
       return meridiem;
    }

    public void setPeriodo(boolean valor){
        this.meridiem = valor;
    }

    public String selecionaPeriodo(boolean valor){
        if(valor == true){
            return "AM";
        }else{
            return"PM";
        }
    }

    @Override
    public void retornaRelogio(int hora, int minutos, int segundos) {
        while(hora < 23){
            String periodo ="AM";
            if(hora > 12){
                hora = hora - 12;
                periodo = "PM";
            }
            if(minutos == 59 ){
                hora++;
                minutos=0;
            }

            String caracterh ="";
            if (hora < 10) {
                caracterh = "0";
            }

            while(minutos < 59){
                if(segundos == 59 ){
                    minutos++;
                    segundos=0;
                }
                String caracterm = "";
                if (minutos < 10) {
                    caracterm = "0";
                }
                while (segundos < 59) {
                    segundos++;
                    System.out.print("\r" + " ".repeat(30));//limpa a linha
                    String caracter = "";
                    if (segundos < 10) {
                        caracter = "0";
                    }
                    System.out.print("\r"+caracterh+hora+":"+caracterm+minutos+ ":" + caracter + segundos + periodo);

                    try {
                        Thread.sleep(1000); // pausa de 1 segundo (opcional, só pra simular tempo real)
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if( hora == 2 && minutos == 2 && segundos == 59){
                        hora = 0;
                        minutos = 0;
                        segundos = 0;
                    }
                }
            }
        }
    }
}
