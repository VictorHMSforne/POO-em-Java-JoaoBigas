package br.edu.Unicesumar;

import javax.sql.StatementEvent;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PartidaDAO implements PartidaDAOInterface{

    private Connection conexao;

    public PartidaDAO(Connection conexao) {
        this.conexao = conexao;
    }

    @Override
    public void salvar(PartidaRanqueada partida) {
        try{
            PreparedStatement veiculo = conexao.prepareStatement("INSERT INTO partida (duracaoMinutos,vencedor,elo) VALUES (?,?,?)");

            veiculo.setInt(1, partida.getDuracaoMinutos());
            veiculo.setString(2,partida.getVencedor());
            veiculo.setString(3,partida.getElo());

            int resultado = veiculo.executeUpdate();

            if (resultado ==1){
                System.out.println("Partida salva com sucesso!");
            }else{
                System.out.println("Erro ao salvar Partida Ranqueada");
            }



        }catch (SQLException exception){
            System.out.printf("Erro ao salvar partida Ranqueada %s", exception);
        }
    }

    @Override
    public void salvar(PartidaTreino partida) {
        try{
            conexao.prepareStatement("INSERT INTO partida (duracaoMinutos,vencedor,bot)");
        }catch (SQLException exception){
            System.out.println("Erro ao salvar partida Treino! ");
        }
    }

    @Override
    public void excluir(int id) {
        try{

        }catch (SQLException exception){
            System.out.println("Erro ao excluir ");
        }
    }

    @Override
    public List<Partida> buscarTodos() {
        try{

            ArrayList<Partida> partidas = new ArrayList<>();

            Statement veiculo = conexao.createStatement();

            ResultSet resultadoBusca = veiculo.executeQuery("SELECT id, duracaoMinutos, vencedor, elo, bots FROM partida;");
            while(resultadoBusca.next()){
                int id = resultadoBusca.getInt("id");
                int duracaoMinutos = resultadoBusca.getInt("duracaoMinutos");
                String vencedor = resultadoBusca.getString("vencedor");
                String elo = resultadoBusca.getString("elo");
                int bots = resultadoBusca.getInt("bots");

                if (elo == null){
                    PartidaTreino partidaTreino = new PartidaTreino(id, duracaoMinutos, vencedor, bots);
                    partidas.add(partidaTreino);
                }else{
                    PartidaRanqueada partidaRanqueada = new PartidaRanqueada(id, duracaoMinutos, vencedor, elo);
                    partidas.add(partidaRanqueada);
                }

                return partidas;

            }


        }catch (SQLException exception){
            System.out.println("Erro ao buscar Paritdas ");
        }
        return List.of();
    }
}
