package Modelo;

// @author Robson Rosa

public class Usuario {
    
    static int cont;
    //colocar private ou protectd em id
    int id;
    private String login;
    private String senha;
    private String nome;

    public Usuario(String login, String senha, String nome) {
        id = cont++;
        this.login = login;
        this.senha = senha;
        this.nome = nome;
    }
   
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    // fazer toString aq
}
