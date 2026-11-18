package br.edu.Unicesumar;

public class PartidaRanqueada extends Partida{
    private String elo;

    public PartidaRanqueada(int id, int duracaoMinutos, String vencedor, String elo) {
        super(id, duracaoMinutos, vencedor);
        this.elo = elo;
    }

    public PartidaRanqueada(int duracaoMinutos, String vencedor, String elo) {
        super(duracaoMinutos, vencedor);
        this.elo = elo;
    }
}
