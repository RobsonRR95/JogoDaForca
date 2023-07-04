/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Modelo.Usuario;
import com.mysql.cj.xdevapi.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author santo
 */
public class UsuarioDAO {
    private Connection connection;
    
    // Puxa a conexão com o BD
    public UsuarioDAO(Connection connection){
        this.connection = connection;
    }

    public UsuarioDAO(com.sun.jdi.connect.spi.Connection connection) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    // Recebe os dados para criação de um novo usuário
    public void inserirUsuario(Usuario usuario) throws SQLException {
        String query = "INSERT INTO usuario (nome, senha, tipo, pontuacao) VALUES (?, ?, ?, 0)"; // Query para inserir um novo usuário
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, usuario.getNome());
        statement.setString(2, usuario.getSenha());
        statement.setInt(3, usuario.getTipo());
        statement.executeUpdate();
    } 
    


    public boolean existeUsuario(String nome) throws SQLException {
        String query = "SELECT COUNT(*) FROM usuario WHERE nome = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, nome);
        ResultSet resultSet = statement.executeQuery();

        if (resultSet.next()) {
            int count = resultSet.getInt(1);
            return count > 0; // Retorna true se já existe um usuário com o mesmo nome
        }

        return false; // Caso ocorra algum problema na consulta
    }

    public Usuario recuperar(String nome) throws SQLException{
        String query = "SELECT * FROM usuario WHERE nome = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, nome);
        ResultSet resultSet = statement.executeQuery();

        // Verifica se houve retorno
        if(resultSet.next()){
            Usuario usuario = new Usuario();
            usuario.setId(resultSet.getInt("id"));
            usuario.setNome(resultSet.getString("nome"));
            usuario.setSenha(resultSet.getString("senha"));
            usuario.setTipo(resultSet.getInt("tipo"));
            return usuario;           
        }
        // Se não houver retorna null
        return null;
    }

    public boolean loginUsuario(String nome, String senha) throws SQLException{
        String query = "SELECT * FROM usuario WHERE nome = ? AND senha = ?";

        try(PreparedStatement statement = connection.prepareStatement(query)){
            statement.setString(1, nome);
            statement.setString(2, senha);
            ResultSet resultSet = statement.executeQuery(); 
            return resultSet.next(); // Retorna true
        }
        catch(SQLException e){
            e.printStackTrace(); // Exibe o erro de conexão do BD no output
        }
        return false;
    }
    
    // Método para retornar os usuários do tipo 2
    public ArrayList<Usuario> getUsuariosTipo2() {
        ArrayList<Usuario> usuariosTipo2 = new ArrayList<>();

        try {
            // Conexão com o banco de dados (supondo que já esteja configurada)
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jogo_da_forca?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=America/Sao_Paulo", "root", "");
            // Criação da consulta SQL
            String query = "SELECT id, nome, pontuacao FROM usuario ORDER BY pontuacao DESC";
            // Criação do statement
            PreparedStatement statement = connection.prepareStatement(query);
            // Execução da consulta
            ResultSet resultSet = statement.executeQuery(query);

            // Iteração pelos resultados
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nome = resultSet.getString("nome");
                int pontuacao = resultSet.getInt("pontuacao");

                // Criação de um objeto Usuario com os dados retornados
                Usuario usuario = new Usuario(id, nome, pontuacao);

                // Adição do usuário à lista de usuários do tipo 2
                usuariosTipo2.add(usuario);
            }

            // Fechamento das conexões
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return usuariosTipo2;
    }
    
}