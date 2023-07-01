/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
    
    // Recebe os dados para criação de um novo usuário
    public void inserirUsuario(Usuario usuario) throws SQLException {
        // Verificar se já existe um usuário com o mesmo nome
        if (existeUsuario(usuario.getNome())) {
            JOptionPane.showMessageDialog(null, "Nickname não disponível! Escolha outro.");
            return; // Retorna sem inserir o novo usuário
        }

        String query = "INSERT INTO usuario (nome, senha, tipo) VALUES (?, ?, ?)"; // Query para inserir um novo usuário
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, usuario.getNome());
        statement.setString(2, usuario.getSenha());
        statement.setInt(3, usuario.getTipo());
        statement.executeUpdate();
    }

    private boolean existeUsuario(String nome) throws SQLException {
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
}