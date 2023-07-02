package Modelo;

// @author Robson Rosa

public class Usuario {
    private int id, tipo;
    private String nome, senha;

//    public Usuario() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
    
//    public Usuario(int id, String nome) {
//        this.id = id;
//        this.nome = nome;
//        throw new UnsupportedOperationException("Not supported yet in publicUsuario(int id, String nome)."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
  
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
}
