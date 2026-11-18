package br.edu.Unicesumar;

public class PartidaTreino extends Partida{
    private int bots;

    public PartidaTreino(int id, int duracaoMinutos, String vencedor, int bots) {
        super(id, duracaoMinutos, vencedor);
        this.bots = bots;
    }

    public PartidaTreino(int duracaoMinutos, String vencedor, int bots) {
        super(duracaoMinutos, vencedor);
        this.bots = bots;
    }
}
