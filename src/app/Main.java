package app;

import java.sql.Connection;
import java.sql.SQLException;

import db.DB;
import model.DAO.UserDAO;
import model.entities.User;

public class Main {
    public static void main(String[] args) throws SQLException {

        Connection conn = DB.gConnection();

        User u = new User();

        u.setName("Juliana");
        u.setAge(18);

        new UserDAO().cadastrarUsuario(u);
        
        DB.closeConnection();
    }
}
