package br.edu.unicesumar;


import java.sql.Connection;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Connection conexao = ConnectionFactory.getConnection();

        PartidaDAO crud = new PartidaDAO(conexao);

        crud.createTable();

        PartidaRanqueada partida1 = new PartidaRanqueada(30, "Teste partida 1", "Prata");
        PartidaTreino partida2 = new PartidaTreino(10, "Teste partida2", 50);

        crud.salvar(partida1);
        crud.salvar(partida2);

        crud.excluir(5);

        List<Partida> busca = crud.buscarTodos();

        for (Partida p : busca){
            System.out.println(p);
        }
    }
}