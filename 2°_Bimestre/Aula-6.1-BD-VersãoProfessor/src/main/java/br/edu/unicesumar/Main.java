package br.edu.unicesumar;

import java.sql.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Connection conexao = ConexaoBanco.getConexao();

        CrudUsuario crudUsuario = new CrudUsuario(conexao);
        crudUsuario.criarTabela();

        Usuario arthur = new Usuario(123, "'); DELETE FROM usuario; --");
        Usuario pedro = new Usuario(757547, "Pedro");

        crudUsuario.cadastrarUsuario(arthur);
        crudUsuario.cadastrarUsuario(pedro);
        List<Usuario> resultadoConsulta = crudUsuario.buscarUsuarios();

        for (Usuario usuario : resultadoConsulta){
            System.out.println(usuario);
        }


    }
}