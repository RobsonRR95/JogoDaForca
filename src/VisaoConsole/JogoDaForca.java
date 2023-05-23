package VisaoConsole;
import Modelo.EnumDificuldade;
import Modelo.Palavra;
// @author Robson Rosa

public class JogoDaForca {
    public static void main(String[] args) {
        
        Palavra p = new Palavra(EnumDificuldade.FAC, "AMOR");
        System.out.println(p);


    }
}
