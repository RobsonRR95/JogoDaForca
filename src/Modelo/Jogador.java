package Modelo;

// @author Robson Rosa

public class Jogador extends Usuario{
    
    private int pontuacao;
    
    public Jogador(String login, String senha, String nome) {
        super(login, senha, nome);
    }
    
    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }
}
