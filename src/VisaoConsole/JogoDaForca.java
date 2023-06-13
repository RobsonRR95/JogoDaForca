package VisaoConsole;
import Modelo.EnumDificuldade;
import Modelo.Palavra;
import static VisaoConsole.Console.output;
import static VisaoConsole.Console.opcao;

// @author Robson Rosa

public class JogoDaForca {
    
    public static void main(String[] args) {
        bemVindo();
    }
    
    public static void bemVindo(){
        output("Seja bem vindo ao Jogo da Forca!", 3);
        if(opcao == 0) output("Você escolheu Jogar!", 0);
        else output("Você escolheu Sair!", 2);
    }
    
    /*public static void cadastrarPalavra(){ //funcao para cadastro de palavras novas pelos administradores
        String palavra = Console.input("Digite a Palavra");
        String dificuldade = Console.input("1 - " + EnumDificuldade.F.getDescricao() +
                                           "\n2 - " + EnumDificuldade.M.getDescricao() + 
                                           "\n3 - " + EnumDificuldade.D.getDescricao() + 
                                           "\nDigite a dificuldade:");
        if("1".equals(dificuldade)){
            Palavra p = new Palavra(EnumDificuldade.F, palavra); 
        }
        else if("2".equals(dificuldade)){
            Palavra p = new Palavra(EnumDificuldade.M, palavra);
        }
        else if("3".equals(dificuldade)){
            Palavra p = new Palavra(EnumDificuldade.D, palavra);
        }
        else{
            Console.output("Dificulade incorreta, digite novamente:", 1);
        }
        
    }   
        
    public static void cadastrarAdministrador(){
        Console.output("cadastrarAdministrador", 0);
    }
*/
    
}
