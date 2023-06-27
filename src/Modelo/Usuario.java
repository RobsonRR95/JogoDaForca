package Modelo;

// @author Robson Rosa

public class Usuario {
    

    private int id;
    private String nome;
    private int senha;
    private int tipo;

    public Usuario(String nome, int senha, int tipo) {
        this.nome = nome;
        this.senha = senha;
        this.tipo = tipo;
    }
    
    public int getID() {
        return id;
    }
   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    } 
    
    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    // TODO: fazer toString aq (Robson)
}
