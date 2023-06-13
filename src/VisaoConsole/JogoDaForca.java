package VisaoConsole;
import Modelo.EnumDificuldade;
import Modelo.Palavra;

// @author Robson Rosa

public class JogoDaForca {
  
    
    public static void main(String[] args) {
        
        cadastrarPalarva(); //teste git com personal token
    }
    
    public static void cadastrarPalarva(){
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
    
    public static void inicializar(){
        Console.output("Inicializar", 0);
    }
    
    public static void cadastrarAdministrador(){
        Console.output("cadastrarAdministrador", 0);
    }
}
