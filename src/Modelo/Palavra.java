package Modelo;

// @author Robson Rosa


public class Palavra {
    private String palavra;
    private EnumDificuldade dificuldade;

    public Palavra(String palavra, EnumDificuldade dificuldade) {
        this.palavra = palavra;
        this.dificuldade = dificuldade;
    }

    public Palavra() {
    
    }
    
    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public EnumDificuldade getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(EnumDificuldade dificuldade) {
        this.dificuldade = dificuldade;
    }
    
}
