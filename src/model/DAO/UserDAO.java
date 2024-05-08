package model.DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.connections.Conexao;
import model.entities.User;

public class UserDAO {

    public void cadastrarUsuario(User user) {

        String sql = "INSERT INTO User (nomeUser, idadeUser) VALUES (?, ?)";

        PreparedStatement ps = null;

        try {

            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, user.getName());
            ps.setInt(2, user.getIdade());

            ps.execute();
            ps.close();

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
