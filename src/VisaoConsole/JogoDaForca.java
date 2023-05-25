package VisaoConsole;
import Modelo.EnumDificuldade;
import Modelo.Palavra;
// @author Robson Rosa

public class JogoDaForca {
    public static void main(String[] args) {
        
        
        //Como pegar do usuario com Console 
        String nome = Console.input("Digite o Nome");
        String dificuldade = Console.input("1 - " + EnumDificuldade.F.getDescricao() +
                                           "\n2 - " + EnumDificuldade.M.getDescricao() + 
                                           "\n3 - " + EnumDificuldade.D.getDescricao() + 
                                           "\nDigite a dificuldade:");
        if("1".equals(dificuldade)){
            Palavra p = new Palavra(EnumDificuldade.F, nome); 
        }
        else if("2".equals(dificuldade)){
            Palavra p = new Palavra(EnumDificuldade.M, nome);
        }
        else if("3".equals(dificuldade)){
            Palavra p = new Palavra(EnumDificuldade.D, nome);
        }
        else{
            Console.output("Dificulade incorreta, digite novamente:", 1);
        }
        
        

    }
}
