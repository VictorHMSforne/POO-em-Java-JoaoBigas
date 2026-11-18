package br.edu.Unicesumar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private static final String URL = "jdbc:h2./banco_prova";
    private static final String USUARIO = "teste";
    private static final String SENHA = "teste123";

    public static Connection getConnection(){
        try{

            return DriverManager.getConnection(URL, USUARIO, SENHA);

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao conectar no banco! %s", e);
        }
    }
}
