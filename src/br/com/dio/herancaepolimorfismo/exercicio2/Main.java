package br.com.dio.herancaepolimorfismo.exercicio2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        var entrada = new Scanner(System.in);
        Colaborador gerente = new Gerente();
        Colaborador vendedor = new Vendedor();
        Colaborador atendente = new Atendente();

        System.out.println("Iniciar Sistema?(s/n)");
        String iniciar = entrada.next();

        if(iniciar.equalsIgnoreCase("s")){

            System.out.println("Consultar Dados" +
                    "\n a Atendente" +
                    "\n g Gerente" +
                    "\n v Vendedor" +
                    "\n digite umas das iniciais");
            var cargo = entrada.next();
            Colaborador user = switch (cargo.toLowerCase()){
                case "a" -> atendente;
                case "g" -> gerente;
                case "v" -> vendedor;
                default -> { System.out.println("Cargo inválido!");yield
                null; }
            };
            assert user != null;
            while(iniciar.equalsIgnoreCase("s")) {
                System.out.println("\nMenu" +
                        "\n0 - LogOff" +
                        "\n1 -  Consultar Cadastro" +
                        "\n2 - Alterar Cadastro" +
                        "\n3- Login");
                int escolha = entrada.nextInt();
                if (escolha == 0) {
                    iniciar = "n";
                    user.realizarLogOff();
                }
                if (escolha == 1) {
                    System.out.println(user.getNome() + " " + user.getEmail() + " " + user.getSenha() + " " + (user.isFlagAdministrador() ? "Administrador" : "Usuário Comum"));
                }
                if (escolha == 2) {
                    System.out.println("Alterar Cadastro?(s/n)");
                    String confirmacao = entrada.next();
                    while (confirmacao.equalsIgnoreCase("s")) {
                        System.out.println("\nQual dado deseja alterar?" +
                                "\n0 - Nenhum" +
                                "\n1 - Nome" +
                                "\n2 - Email" +
                                "\n3 - Senha");
                        int option = entrada.nextInt();
                        switch (option) {
                            case 0:
                                confirmacao = "n";
                                break;
                            case 1:
                                System.out.println("Digite um novo nome:");
                                String novoNome = entrada.next();
                                user.alterarDados(novoNome, "nome");
                                break;
                            case 2:
                                System.out.println("Digite um novo endereço de email:");
                                String novoEmail = entrada.next();
                                user.alterarDados(novoEmail, "email");
                                break;
                            case 3:
                                System.out.println("Digite um novo endereço de email:");
                                String novaSenha = entrada.next();
                                user.alterarSenha(novaSenha);
                                break;

                        }
                    }
                }
                if (escolha == 3) {
                    System.out.println("Digite o email: ");
                    var email = entrada.next();
                    System.out.println("Digite a senha: ");
                    var senha = entrada.next();
                    user.realizarLogin(email, senha);

                    if (user.isFlagOnline()) {
                        if (user.getTipoDeUsuario().equalsIgnoreCase("atendente")) {

                            while (user.isFlagOnline()) {
                                System.out.println("\nFunções:" +
                                        "\n0 - LogOff" +
                                        "\n1 - Receber Pagamento" +
                                        "\n2 - Fechar Caixa");
                                int funcao = entrada.nextInt();

                                switch (funcao) {
                                    case 0:
                                        user.realizarLogOff();
                                        break;
                                    case 1:
                                        System.out.println("Valor a receber: ");
                                        var valor = entrada.nextDouble();
                                        if (user instanceof Atendente) ((Atendente) user).receberPagamento(valor);
                                        break;
                                    case 2:
                                        System.out.println("Qual o valor que está no caixa?");
                                        var valorFinal = entrada.nextDouble();
                                        if (user instanceof Atendente) ((Atendente) user).fecharCaixa(valorFinal);
                                        break;
                                    default:
                                        System.out.println("Opção Inválida");
                                }
                            }
                        //fim funcoes atendente
                        //inicio funcoes vendedor
                        } else if(user.getTipoDeUsuario().equalsIgnoreCase("vendedor")){
                            while (user.isFlagOnline()) {
                                System.out.println("\nFunções:" +
                                        "\n0 - LogOff" +
                                        "\n1 - Cadastrar uma venda" +
                                        "\n2 - Consultar Vendas");
                                int funcao = entrada.nextInt();

                                switch (funcao) {
                                    case 0:
                                        user.setFlagOnline(false);
                                        break;
                                    case 1:
                                        if (user instanceof Vendedor) ((Vendedor) user).realizarVendas();
                                        break;
                                    case 2:
                                        if (user instanceof Vendedor) ((Vendedor) user).consultarVendas();
                                        break;
                                    default:
                                        System.out.println("Opcão Inválida!");
                                }
                            }
                        }else if(user.getTipoDeUsuario().equalsIgnoreCase("gerente")) {
                            while (user.isFlagOnline()) {
                                System.out.println("\nFunções:" +
                                        "\n0 - LogOff" +
                                        "\n1 - Gerar Relatório Financeiro" +
                                        "\n2 - Consultar Vendas");
                                int funcao = entrada.nextInt();

                                switch (funcao) {
                                    case 0:
                                        user.setFlagOnline(false);
                                        break;
                                    case 1:
                                        if (user instanceof Gerente) ((Gerente) user).gerarRelatorio();
                                        break;
                                    case 2:
                                        if (user instanceof Gerente) ((Gerente) user).consultarVendas();
                                        break;
                                    default:
                                        System.out.println("Opcão Inválida!");
                                }
                            }
                        }
                    }
                }
            }

        }else{
            System.out.println("Saiu!");
        }
    }
}
