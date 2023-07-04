/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VisaoConsole;

import DAO.UsuarioDAO;
import Modelo.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author santo
 */
public class TelaMenu extends javax.swing.JFrame {

    /**
     * Creates new form TelaMenu
     */
    
    private final String nick; // Recebe o nickname único do usuário
    
    public TelaMenu(String nome) {
        initComponents();
        nick = nome;
    }    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btJogar = new javax.swing.JButton();
        btCadastroUsuario = new javax.swing.JButton();
        btCadastroPalavra = new javax.swing.JButton();
        btListaJogadores = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Menu Inicial");

        btJogar.setText("Jogar");
        btJogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btJogarActionPerformed(evt);
            }
        });

        btCadastroUsuario.setText("Cadastrar Usuário");
        btCadastroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastroUsuarioActionPerformed(evt);
            }
        });

        btCadastroPalavra.setText("Cadastrar Palavra");
        btCadastroPalavra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastroPalavraActionPerformed(evt);
            }
        });

        btListaJogadores.setText("Ranking");
        btListaJogadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListaJogadoresActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir Usuário");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(jLabel1)
                .addContainerGap(212, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btListaJogadores, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCadastroPalavra, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btJogar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCadastroUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(184, 184, 184))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addComponent(btJogar)
                .addGap(18, 18, 18)
                .addComponent(btCadastroUsuario)
                .addGap(18, 18, 18)
                .addComponent(btCadastroPalavra)
                .addGap(18, 18, 18)
                .addComponent(btListaJogadores)
                .addGap(18, 18, 18)
                .addComponent(btExcluir)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastroUsuarioActionPerformed
        
        // Faz a conexão com o BD
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jogo_da_forca?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=America/Sao_Paulo", "root", "");
        }
        catch (SQLException ex) {
            
        }
        
        UsuarioDAO usuarioDAO = new UsuarioDAO(connection);
        
        // Try Catch para validar conexão com o BD
        try {
            Usuario usuarioRecuperado = usuarioDAO.recuperar(nick); // Pegar o nick do usuário logado
            int tipoUsuario = usuarioRecuperado.getTipo(); // Pega o tipo para validar se é administrador ou  não
            if(tipoUsuario == 1){
                //JOptionPane.showMessageDialog(this, "Você é o: " + nick);
                TelaCadastroUsuario telaCadastroUsuario = new TelaCadastroUsuario();
                telaCadastroUsuario.setVisible(true);
                //this.setVisible(false); // Desativei provisório, não consegui remover, já que a TelaMenu precisa ser chamada com a entrega do nome.
            }
            else{
                JOptionPane.showMessageDialog(this, "Você não é um administrador! Permissão negada."); // Else caso o usuário não seja administrador.
            }
        } catch (SQLException ex) {
            Logger.getLogger(TelaMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btCadastroUsuarioActionPerformed

    private void btListaJogadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListaJogadoresActionPerformed
        TelaListarUsuario telaListarUsuario = null;
        try {
            telaListarUsuario = new TelaListarUsuario();
        } catch (SQLException ex) {
            Logger.getLogger(TelaMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        telaListarUsuario.setVisible(true);
    }//GEN-LAST:event_btListaJogadoresActionPerformed

    private void btCadastroPalavraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastroPalavraActionPerformed
        // Faz a conexão com o BD
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jogo_da_forca?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=America/Sao_Paulo", "root", "");
        }
        catch (SQLException ex) {
            
        }
        
        UsuarioDAO usuarioDAO = new UsuarioDAO(connection);
        
        // Try Catch para validar conexão com o BD
        try {
            Usuario usuarioRecuperado = usuarioDAO.recuperar(nick); // Pegar o nick do usuário logado
            int tipoUsuario = usuarioRecuperado.getTipo(); // Pega o tipo para validar se é administrador ou  não
            if(tipoUsuario == 1){
                //JOptionPane.showMessageDialog(this, "Você é o: " + nick);
                TelaCadastroPalavra telaCadastroPalavra = new TelaCadastroPalavra();
                telaCadastroPalavra.setVisible(true);
                //this.setVisible(false); // Desativei provisório, não consegui remover, já que a TelaMenu precisa ser chamada com a entrega do nome.
            }
            else{
                JOptionPane.showMessageDialog(this, "Você não é um administrador! Permissão negada."); // Else caso o usuário não seja administrador.
            }
        } catch (SQLException ex) {
            Logger.getLogger(TelaMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btCadastroPalavraActionPerformed

    private void btJogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btJogarActionPerformed
        TelaJogar telaJogar = null;
        try {
            telaJogar = new TelaJogar(nick);
        } catch (SQLException ex) {
            Logger.getLogger(TelaMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        telaJogar.setVisible(true);
    }//GEN-LAST:event_btJogarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        // Faz a conexão com o BD
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jogo_da_forca?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=America/Sao_Paulo", "root", "");
        }
        catch (SQLException ex) {
            
        }
        
        UsuarioDAO usuarioDAO = new UsuarioDAO(connection);
        
        // Try Catch para validar conexão com o BD
        try {
            Usuario usuarioRecuperado = usuarioDAO.recuperar(nick); // Pegar o nick do usuário logado
            int tipoUsuario = usuarioRecuperado.getTipo(); // Pega o tipo para validar se é administrador ou  não
            if(tipoUsuario == 1){
                //JOptionPane.showMessageDialog(this, "Você é o: " + nick);
                TelaExcluir telaExcluir = new TelaExcluir(nick);
                telaExcluir.setVisible(true);
                //this.setVisible(false); // Desativei provisório, não consegui remover, já que a TelaMenu precisa ser chamada com a entrega do nome.
            }
            else{
                JOptionPane.showMessageDialog(this, "Você não é um administrador! Permissão negada."); // Else caso o usuário não seja administrador.
            }
        } catch (SQLException ex) {
            Logger.getLogger(TelaMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btExcluirActionPerformed

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//               //new TelaMenu().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastroPalavra;
    private javax.swing.JButton btCadastroUsuario;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btJogar;
    private javax.swing.JButton btListaJogadores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
