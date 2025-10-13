import java.util.Scanner;
public class ExemploSimples {
    private final static String WELCOME_MESSAGE = "Seja bem vindo!";

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println(WELCOME_MESSAGE);
        System.out.println("Informe o seu nome:");
        var name = scanner.next();
        System.out.println("Informe o sua idade:");
        var age = scanner.nextInt();
        System.out.printf("Olá %s sua idade é %s anos \n", name, age );
    }
}
