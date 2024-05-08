package app;

import model.DAO.UserDAO;
import model.entities.User;

public class Main {
    public static void main(String[] args) {

        User u = new User();
        
        u.setName("Luan");
        u.setIdade(20);

        new UserDAO().cadastrarUsuario(u);

    }
}
