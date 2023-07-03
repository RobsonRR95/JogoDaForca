package Modelo;

// @author Robson Rosa

import java.util.ArrayList;


public class Palavra {
    private int id;
    private ArrayList<String> letras;
    private String palavra;
    private String dificuldade;

    public Palavra(ArrayList<String> letras, String dificuldade) {
        this.letras = letras;
        this.dificuldade = dificuldade;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }
    
}
