package br.edu.Unicesumar;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CrudUsuario {
    private Connection conexao;

    public CrudUsuario(Connection conexao) {
        this.conexao = conexao;
    }

    public void criarTabela(){
        try{

            Statement stm = conexao.createStatement();

            stm.execute("CREATE TABLE IF NOT EXISTS usuario(" +
                    "id INT, " +
                    "nome VARCHAR(50)" + ");"
            );

            System.out.println("Tabela Criada com Sucesso!");
        }catch (SQLException ex){
            System.out.println(ex);
        }
    }

    public void criarUsuario(Usuario novoUsuario){

        try{
            Statement veiculo = conexao.createStatement(); // Véiculo de conexão

            String insert = "INSERT INTO usuario(id, nome) " +
                            "VALUES(" + novoUsuario.getId() +",'" + novoUsuario.getNome() + "') ";

            int result =  veiculo.executeUpdate(insert);
            if (result ==  1){
                System.out.println("Insert Conclúido");
            }else
                System.out.println("Insert não executado!");
        }catch (SQLException ex){
            System.out.printf("Erro ao inserir usuário! %s", ex);
        }

    }
}
