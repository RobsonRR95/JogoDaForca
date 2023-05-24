package Modelo;

// @author Robson Rosa

public class Palavra {
    
    private EnumDificuldade dificuldade;
    private String palavra;
    private int quantidadeDeLetras;

    public Palavra(EnumDificuldade dificuldade, String palavra) {
        this.dificuldade = dificuldade;
        this.palavra = palavra;
        quantidadeDeLetras = this.palavra.length();
    }

    public EnumDificuldade getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(EnumDificuldade dificuldade) {
        this.dificuldade = dificuldade;
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public int getQuantidadeDeLetras() {
        return quantidadeDeLetras;
    }
    
    
}
