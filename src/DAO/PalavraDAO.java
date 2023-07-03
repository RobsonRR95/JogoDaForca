package DAO;

import Modelo.Palavra;
import Modelo.Usuario;
import static java.lang.Math.random;
import static java.lang.StrictMath.random;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;


// @author Robson Rosa

public class PalavraDAO {
    private Connection connection;
    
    // Puxa a conexão com o BD
    public PalavraDAO(Connection connection){
        this.connection = connection;
    }
    
    // Recebe os dados para criação de um novo usuário
    public void inserirUsuario(Usuario usuario) throws SQLException {
        String query = "INSERT INTO usuario (nome, senha, tipo) VALUES (?, ?, ?)"; // Query para inserir um novo usuário
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

//    public Palavra recuperar(int id) throws SQLException{
//        String query = "SELECT * FROM palavra WHERE id = ?";
//        PreparedStatement statement = connection.prepareStatement(query);
//        statement.setInt(1, id);
//        ResultSet resultSet = statement.executeQuery();
//
//        // Verifica se houve retorno
//        if(resultSet.next()){
//            Palavra p = new Palavra();
//            p.setId(resultSet.getInt("id"));
//            p.setPalavra(resultSet.getString("nome"));
//            p.setDificuldade(resultSet.getString("senha"));
//            return p;           
//        }
//        // Se não houver retorna null
//        return null;
//    }
    
    public ArrayList<String> recuperar(int id) throws SQLException {
        String query = "SELECT * FROM palavra WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, id);
        ResultSet resultSet = statement.executeQuery();

        ArrayList<String> letras = new ArrayList<>();

        // Verifica se houve retorno
        while (resultSet.next()) {
            String palavra = resultSet.getString("palavra");
            for (int i = 0; i < palavra.length(); i++) {
                letras.add(Character.toString(palavra.charAt(i)));
            }
        }

        // Se não houver retorna null
        return letras;
    }


    public int getIdAleatorio() throws SQLException{ // Retorna um ID aleatório para escolher a palavra que inicia o jogo
            String sql = "SELECT MAX(id) FROM palavra";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                int maxId = resultSet.getInt(1);               
                // Gera um número aleatório entre 1 e maxId
                Random random = new Random();
                int idAleatorio = random.nextInt(maxId - 301 + 1) + 301;
                return idAleatorio;
            }
            return 0;
    }
}