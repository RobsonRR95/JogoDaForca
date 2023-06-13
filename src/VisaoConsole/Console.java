package VisaoConsole;

import javax.swing.*;

// @author Robson Rosa

public class Console {
    
    static int opcao;
    
    public static String input (String mensagem){
        String s = JOptionPane.showInputDialog(null, mensagem);
        return s;
    }
    
    public static int output (String mensagem, int tipoMensagem){
        Object[] opcoesBemVindo = {"Jogar", "Sair"}; 
        
        switch (tipoMensagem){
            case 0: JOptionPane.showMessageDialog(null, mensagem);
                break;
            case 1: JOptionPane.showMessageDialog(null, mensagem,
                    "ERRO", JOptionPane.ERROR_MESSAGE );
                break;
            case 2: JOptionPane.showMessageDialog(null, mensagem,
                    "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
                break;
            case 3: opcao = JOptionPane.showOptionDialog(null, mensagem, "Jogo da Forca", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoesBemVindo, opcoesBemVindo[0]);
        }
        return 0;
    }
    
    public int getOpcao(){
        return opcao;
    }
}