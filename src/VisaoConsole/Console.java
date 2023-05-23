package VisaoConsole;

import javax.swing.*;

// @author Robson Rosa

public class Console {
    
    public String input (String mensagem){
        String s = JOptionPane.showInputDialog(null, mensagem);
        return s;
    }
    
    public void output (String mensagem, int tipoMensagem){
         switch (tipoMensagem){
            case 0: JOptionPane.showMessageDialog(null, mensagem);
                break;
            case 1: JOptionPane.showMessageDialog(null, mensagem,
                    "ERRO", JOptionPane.ERROR_MESSAGE );
                break;
            case 2: JOptionPane.showMessageDialog(null, mensagem,
                    "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
                break;
                
        }
    }
}