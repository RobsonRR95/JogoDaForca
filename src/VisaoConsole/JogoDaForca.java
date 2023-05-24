package VisaoConsole;
import Modelo.EnumDificuldade;
import Modelo.Palavra;
// @author Robson Rosa

public class JogoDaForca {
    public static void main(String[] args) {
        
        
        //Como pegar do usuario com Console 
        String nome = Console.input("Digite o Nome");
        String dif = Console.input("Digite a dificuldade:");
        Palavra p = new Palavra(EnumDificuldade.dif, nome);
        

    }
}
