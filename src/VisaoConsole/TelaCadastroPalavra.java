/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VisaoConsole;

import DAO.PalavraDAO;
import Modelo.EnumDificuldade;
import Modelo.Palavra;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

/**
 *
 * @author santo
 */
public class TelaCadastroPalavra extends javax.swing.JFrame {
    
//    private String dificuldade;
    
    /**
     * Creates new form TelaCadastroPalavra
     */
    public TelaCadastroPalavra() {
        initComponents();


        AbstractDocument doc = (AbstractDocument) textPalavra.getDocument();
        doc.setDocumentFilter(new DocumentFilter() {
            @Override
            public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                // Valida se o texto inserido é uma letra e tem apenas um caractere, sem espaços
                if (text.matches("[a-zA-Z]") && !text.contains(" ")) {
                    // Permite a substituição do texto
                    super.replace(fb, offset, length, text, attrs);
                }
            }
        });
        
        AbstractDocument doc2 = (AbstractDocument) textDica.getDocument();
        doc2.setDocumentFilter(new DocumentFilter() {
            @Override
            public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                // Valida se o texto inserido é uma letra e tem apenas um caractere, sem espaços
                if (text.matches("[a-zA-Z]") && !text.contains(" ")) {
                    // Permite a substituição do texto
                    super.replace(fb, offset, length, text, attrs);
                }
            }
        });

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
        jLabel2 = new javax.swing.JLabel();
        textPalavra = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        selectDificuldade = new javax.swing.JComboBox<>();
        btCadastrar = new javax.swing.JToggleButton();
        btCancelar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        textDica = new javax.swing.JTextField();

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setText("Cadastro de Palavra");

        jLabel2.setText("Palavra:");

        jLabel3.setText("Dificuldade:");

        selectDificuldade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Facil", "Medio", "Dificil" }));
        selectDificuldade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectDificuldadeActionPerformed(evt);
            }
        });

        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        jLabel4.setText("Dica:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(153, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(selectDificuldade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(textDica))
                                .addComponent(textPalavra, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(142, 142, 142))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textPalavra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textDica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(selectDificuldade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar)
                    .addComponent(btCancelar))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        dispose(); // Joga a tela fora 
    }//GEN-LAST:event_btCancelarActionPerformed

    private void selectDificuldadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectDificuldadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectDificuldadeActionPerformed
        // TODO adicionar filtro no textfield palavra
    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jogo_da_forca?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=America/Sao_Paulo", "root", "");
        }
        catch (SQLException ex) {
            // TODO: fazer catch da falha de conexão do BD
        }
        
        String palavra = textPalavra.getText().toUpperCase();
        String dica = textDica.getText(); // .substring(0, 1).toUpperCase().substring(1).toLowerCase(); // Teste para padronizar palavra
        String combo = (String) selectDificuldade.getSelectedItem(); // Faz o cast da seleção para String
        
        EnumDificuldade dificuldade;
        
        if(combo.equals("Facil")){
            dificuldade = EnumDificuldade.F;
        }else if(combo.equals("Medio")){
            dificuldade = EnumDificuldade.M;
        }
        else{
            dificuldade = EnumDificuldade.D;
        }
        
        if(palavra.equals("") || dica.equals("")){ // Verifica se o campo palavra esta preenchidos
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!");
        }
        else{
            // Chamar o método inserirUsuario passando o objeto Usuario como argumento
            
            PalavraDAO palavraDAO = new PalavraDAO(connection);
                        
            try {
                if(palavraDAO.existe(palavra)){ // Chama o método e caso retorne true avisa que Nickmane já existe
                    JOptionPane.showMessageDialog(null, "Palavra já cadastrada! Escolha outra.");
                }
                else{ // Se a palavra não existir, cadastra a palavra
                    Palavra palavraCadastrada = new Palavra(palavra, dificuldade, dica);
                    
                
                    try {
                        palavraDAO.inserir(palavraCadastrada);
                        JOptionPane.showMessageDialog(this, "Palavra inserida com sucesso!");
                        dispose();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(this, "Erro ao inserir usuário: " + e.getMessage());
                    }  
                }
            } catch (Exception ex) {
                Logger.getLogger(TelaCadastroPalavra.class.getName()).log(Level.SEVERE, null, ex);
            }
            
           
        }
    }//GEN-LAST:event_btCadastrarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btCadastrar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> selectDificuldade;
    private javax.swing.JTextField textDica;
    private javax.swing.JTextField textPalavra;
    // End of variables declaration//GEN-END:variables
}
