package br.edu.Unicesumar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoBanco {

    private static final String URL = "jdbc:mysql://localhost:3306/banco_aula";
    private static final String USER = "root";
    private static final String ROOT = "";

    public static Connection getConexao(){

        //        Conexão Local com JDBC usando o banco h2
        //        String url = "jdbc:h2:meu_banco";
        //        String user = "teste";
        //        String senha = "";

        // stm.execute("CREATE TABLE IF NOT"); // Criação do BD em h2


        try {
            Connection con = DriverManager.getConnection(URL,USER,ROOT);
            System.out.println("Conexão bem sucedida!");
            return con;

        }catch(SQLException ex){
            throw  new IllegalArgumentException("Erro ao Conectar com o Banco!");

        }

    }
}
