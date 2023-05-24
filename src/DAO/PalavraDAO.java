package DAO;
import Modelo.EnumDificuldade;
import Modelo.Palavra;

// @author Robson Rosa

public class PalavraDAO extends Palavra{
    
    public PalavraDAO(EnumDificuldade dificuldade, String palavra) {
        super(dificuldade, palavra);
    }
    
}
