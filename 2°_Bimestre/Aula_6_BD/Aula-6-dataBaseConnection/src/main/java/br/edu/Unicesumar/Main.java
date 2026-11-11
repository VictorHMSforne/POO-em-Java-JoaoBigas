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

        Connection con = ConexaoBanco.getConexao();

        CrudUsuario crud = new CrudUsuario(con);

        crud.criarTabela();

        Usuario joao = new Usuario(1,"Rob Son");

       // crud.criarUsuario(joao);


    }
}