package br.edu.unicesumar;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CrudUsuario {

    private Connection conexao;

    public CrudUsuario(Connection conexao) {
        this.conexao = conexao;
    }

    public void criarTabela(){

        try {

            Statement veiculo = conexao.createStatement();

            veiculo.execute("CREATE TABLE IF NOT EXISTS usuario (" +
                    "id INT, " +
                    "nome VARCHAR(10)" +
                    ");");
            System.out.println("Tabela criada com sucesso!");

        }catch (SQLException exception){
            throw new IllegalArgumentException("Erro para criar tabela!");
        }
    }

    public void cadastrarUsuario(Usuario novoUsuario){
        try {

            PreparedStatement veiculo = conexao.prepareStatement("INSERT INTO usuario(id, nome) VALUES (?,?);");

            veiculo.setInt(1, novoUsuario.getId());
            veiculo.setString(2, novoUsuario.getNome());

            int resultadoInsert = veiculo.executeUpdate();

            if (resultadoInsert == 1){
                System.out.println("Usuário cadastrado com sucesso!");
            }else {
                System.out.printf("Foram executados %d alterações.", resultadoInsert);
            }

        }catch (SQLException exception){
            System.out.println("Erro para cadastrar Usuário!");
        }
    }

    public List<Usuario> buscarUsuarios(){

        List<Usuario> usuariosBuscados = new ArrayList<>();

        try {

            Statement veiculo = conexao.createStatement();

            ResultSet resultadoSelect = veiculo.executeQuery("SELECT id, nome FROM usuario;");

            while (resultadoSelect.next()){

                int id = resultadoSelect.getInt("id");
                String nome = resultadoSelect.getString("nome");

                Usuario usuarioBuscado = new Usuario(id, nome);
                usuariosBuscados.add(usuarioBuscado);

            }

        }catch (SQLException exception){
            System.out.println("Erro buscar usuário no banco!");
        }

        return usuariosBuscados;
    }
}
