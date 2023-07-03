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
    
    public String recuperarDificuldade(int id) throws SQLException {
        String query = "SELECT dificuldade FROM palavra WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, id);
        ResultSet resultSet = statement.executeQuery();

        String dificuldade = null;

        // Verifica se houve retorno
        if (resultSet.next()) {
            dificuldade = resultSet.getString("dificuldade");
        }

        // Se não houver retorno, dificuldade será null
        return dificuldade;
    }
    
    public int getIdAleatorio() throws SQLException{ // Retorna um ID aleatório para escolher a palavra que inicia o jogo
            String sql = "SELECT MAX(id) FROM palavra";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            
            String sql2 = "SELECT MIN(id) FROM palavra";
            PreparedStatement statement2 = connection.prepareStatement(sql2);
            ResultSet resultSet2 = statement2.executeQuery();

            if (resultSet.next() && resultSet2.next()) {
                int maxId = resultSet.getInt(1);
                int minId = resultSet2.getInt(1);
                // Gera um número aleatório entre minId e maxId
                Random random = new Random();
                int idAleatorio = random.nextInt(maxId - minId + 1) + 301;
                return idAleatorio;
            }
            return 0;
    }

    public boolean substituirPorLetra(ArrayList<String> letras, ArrayList<String> tracos, String letra) {
        String letraLowerCase = letra.toLowerCase(); // Converte a letra para minúscula
        boolean trocaFeita = false; // Variável para indicar se houve troca

        for (int i = 0; i < letras.size(); i++) {
            String elemento = letras.get(i).toLowerCase(); // Converte o elemento para minúscula
            if (elemento.equals(letraLowerCase)) {
                tracos.set(i, letra); // Substitui o valor correspondente em tracos pela letra
                trocaFeita = true; // Define a variável como true, indicando que houve troca
            }
        }

        return trocaFeita; // Retorna o valor indicando se houve troca ou não
    }
    
    public boolean ganhou(ArrayList<String> array1, ArrayList<String> array2) {
        // Verifica se os arrays têm tamanhos diferentes
        if (array1.size() != array2.size()) {
            return false;
        }

        // Compara cada elemento dos arrays, ignorando o caso
        for (int i = 0; i < array1.size(); i++) {
            if (!array1.get(i).equalsIgnoreCase(array2.get(i))) {
                return false; // Se um elemento for diferente, retorna falso
            }
        }

        return true; // Se todos os elementos forem iguais, retorna verdadeiro
    }


}