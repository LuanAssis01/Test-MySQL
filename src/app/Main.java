package app;

import java.sql.Connection;

import db.DB;

public class Main {
    public static void main(String[] args) {

        Connection conn = DB.gConnection();
        DB.closeConnection();
    }
}
