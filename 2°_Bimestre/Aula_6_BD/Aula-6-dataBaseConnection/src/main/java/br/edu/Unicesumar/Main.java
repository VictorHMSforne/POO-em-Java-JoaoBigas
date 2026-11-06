package br.edu.Unicesumar;

import javax.swing.plaf.nimbus.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String url = "jdbc:h2:meu_banco";
        String user = "teste";
        String senha = "";

        try (Connection con = DriverManager.getConnection(url,user,senha)){
            Statement stm = con.createStatement();

            stm.execute("CREATE TABLE IF NOT"); // Criação do BD

        }catch(SQLException ex){

        }
    }
}