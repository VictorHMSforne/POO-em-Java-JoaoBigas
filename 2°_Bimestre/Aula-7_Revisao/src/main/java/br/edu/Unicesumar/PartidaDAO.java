package br.edu.Unicesumar;

import java.sql.Connection;
import java.util.List;

public class PartidaDAO implements PartidaDAOInterface{

    private Connection conexao;

    public PartidaDAO(Connection conexao) {
        this.conexao = conexao;
    }

    @Override
    public void salvar(PartidaRanqueada partida) {
        
    }

    @Override
    public void salvar(PartidaTreino partida) {

    }

    @Override
    public void excluir(int id) {

    }

    @Override
    public List<Partida> buscarTodos() {
        return List.of();
    }
}
