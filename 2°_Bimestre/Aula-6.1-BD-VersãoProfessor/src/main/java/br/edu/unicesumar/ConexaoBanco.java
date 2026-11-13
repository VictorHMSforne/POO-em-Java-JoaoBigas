package br.edu.unicesumar;

import java.sql.*;

public class ConexaoBanco {

    private static final String URL = "jdbc:h2:./banco_aula";
    private static final String USUARIO = "teste";
    private static final String SENHA = "teste123";


    public static Connection getConexao(){

        try {

            return DriverManager.getConnection(URL, USUARIO, SENHA);

        }catch (SQLException exception){
            throw new ConexaoBancoException();
        }

    }

}
