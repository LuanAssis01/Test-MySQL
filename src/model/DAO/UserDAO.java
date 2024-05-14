package model.DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;
import db.DbException;
import model.entities.User;

public class UserDAO {

    public void cadastrarUsuario(User user) throws SQLException {
        
        String sql = "INSERT INTO User (nomeUser, idadeUser) VALUES (?, ?)";
        PreparedStatement ps = null;

        try {

            ps = DB.gConnection().prepareStatement(sql);
            ps.setString(1, user.getName());
            ps.setInt(2, user.getAge());

            ps.execute();
            ps.close();

        } catch (DbException e) {
            throw new DbException(e.getMessage());
        } finally{
            DB.closeConnection(); 
        }
    }

}
