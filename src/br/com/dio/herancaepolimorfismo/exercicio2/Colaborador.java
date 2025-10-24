package br.com.dio.herancaepolimorfismo.exercicio2;

public sealed abstract class Colaborador permits FuncionarioDeVendas,Atendente {
    protected String nome;
    protected String email;
    protected String senha;
    protected String tipoDeUsuario = "Colaborador";
    protected boolean flagAdministrador = false;
    protected boolean flagOnline = false;


    public String getNome() {
        return nome;
    }

    public String getTipoDeUsuario(){
        return tipoDeUsuario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


    public boolean isFlagAdministrador() {
        return flagAdministrador;
    }

    public boolean isFlagOnline() {
        return flagOnline;
    }

    public void setFlagOnline(boolean flagOnline) {
        this.flagOnline = flagOnline;
    }

    public void setFlagAdministrador(boolean flagAdministrador) {
        this.flagAdministrador = flagAdministrador;
    }

    //METODOS
    public void realizarLogin(String email, String senha){
        if(getEmail().equalsIgnoreCase(email) && getSenha().equalsIgnoreCase(senha)){
            System.out.printf("Login realizado com sucesso %s", getNome());
            setFlagOnline(true);
        }else{
            System.out.printf("Email ou Senha invalida");
            setFlagOnline(false);
        }
    }

    public void realizarLogOff(){
        System.out.println("Saiu do Sistema!");
        setFlagOnline(false);
    }

   public void alterarDados(String valorAlterado, String tipo){
        if(tipo.equalsIgnoreCase("nome")){
            setNome(valorAlterado);
        }else if(tipo.equalsIgnoreCase("email")){
            setEmail(valorAlterado);
        }
    }

    public void alterarSenha(String valorAlterado){
        setSenha(valorAlterado);

    }




}
