package Modelo;

// @author Robson Rosa

public class Usuario {
    private int id, tipo, pontuacao;
    private String nome, senha;

 // Construtor sem parâmetros
    public Usuario() {
    }

    // Construtor com parâmetros
    public Usuario(int id, String nome, int pontuacao) {
        this.id = id;
        this.nome = nome;
        this.pontuacao = pontuacao;
    }
  
    // Getters e Setter

    public int getId() { // Retorna ID
        return id;
    }
    
    public void setId(int id) { // Retorna ID
        this.id = id;
    }

    public String getSenha() { // Retorna Senha
        return senha;
    }

    public void setSenha(String senha) { // Define a senha
        this.senha = senha;
    }

    public int getTipo() { // Retorna Tipo
        return tipo;
    }

    public void setTipo(int tipo) { // Define o Tipo
        this.tipo = tipo;
    }

    public String getNome() { // Retorna o Nome
        return nome;
    }

    public void setNome(String nome) { // Define o nome
        this.nome = nome;
    }    

    public Object getPontuacao() {
        return pontuacao;
    }
}
