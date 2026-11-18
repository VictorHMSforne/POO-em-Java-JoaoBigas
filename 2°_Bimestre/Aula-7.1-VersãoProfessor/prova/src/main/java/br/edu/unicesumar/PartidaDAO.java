package br.edu.unicesumar;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PartidaDAO implements PartidaDAOInterface {

    private Connection conexao;

    public PartidaDAO(Connection conexao) {
        this.conexao = conexao;
    }

    @Override
    public void salvar(PartidaRanqueada partida) {

        try {

            PreparedStatement veiculo = conexao.prepareStatement("INSERT INTO partida (duracaoMinutos, vencedor, elo) VALUES (?,?,?);");

            veiculo.setInt(1, partida.getDuracaoMinutos());
            veiculo.setString(2, partida.getVencedor());
            veiculo.setString(3, partida.getElo());

            int resultado = veiculo.executeUpdate();

            if (resultado == 1){
                System.out.println("Partida salva com sucesso!");
            }

        }catch (SQLException e){
            System.out.println("Erro ao salvar Partida Ranqueada!");
        }

    }

    @Override
    public void salvar(PartidaTreino partida) {

        try {

            PreparedStatement veiculo = conexao.prepareStatement("INSERT INTO partida (duracaoMinutos, vencedor, bots) VALUES (?,?,?);");

            veiculo.setInt(1, partida.getDuracaoMinutos());
            veiculo.setString(2, partida.getVencedor());
            veiculo.setInt(3, partida.getBots());

            int resultado = veiculo.executeUpdate();

            if (resultado == 1){
                System.out.println("Partida salva com sucesso!");
            }

        }catch (SQLException e){
            System.out.println("Erro ao salvar Partida Treino!");
        }

    }

    @Override
    public void excluir(int id) {

        try {

            PreparedStatement veiculo = conexao.prepareStatement("DELETE FROM partida WHERE id=?;");

            veiculo.setInt(1, id);

            int resultado = veiculo.executeUpdate();

            if (resultado == 1){
                System.out.println("Partida excluida com sucesso!");
            }

        }catch (SQLException e){
            System.out.println("Erro ao excluir Partida!");
        }

    }

    @Override
    public List<Partida> buscarTodos() {

        List<Partida> partidas = new ArrayList<>();

        try {

            Statement veiculo = conexao.createStatement();

            ResultSet resultadoBusca = veiculo.executeQuery("SELECT id, duracaoMinutos, vencedor, elo, bots FROM partida;");

            while (resultadoBusca.next()){

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


            }

        }catch (SQLException e){
            System.out.println("Erro ao buscar Partidas!");
        }

        return partidas;
    }

    public void createTable(){
        try {

            Statement veiculo = conexao.createStatement();

            veiculo.execute("CREATE TABLE IF NOT EXISTS partida (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "duracaoMinutos INT," +
                    "vencedor VARCHAR(50)," +
                    "elo VARCHAR(50)," +
                    "bots INT);");

        }catch (SQLException e){
            System.out.println("Erro ao criar tabela!");
        }
    }
}
