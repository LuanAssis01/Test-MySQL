package app;

import java.sql.Connection;
import java.sql.SQLException;

import db.DB;
import db.DbException;
import model.DAO.UserDAO;
import model.entities.User;

public class Main {
    public static void main(String[] args) {

        Connection conn = DB.gConnection();

        try {
            User u = new User();

            u.setName("Flávia");
            u.setAge(17);

            new UserDAO().cadastrarUsuario(u);
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        }

        DB.closeConnection();
    }
}
