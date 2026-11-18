package br.edu.Unicesumar;

public abstract class Partida {
    private int id;
    private int duracaoMinutos;
    private String vencedor;

    public Partida(int id, int duracaoMinutos, String vencedor) {
        this.id = id;
        this.duracaoMinutos = duracaoMinutos;
        this.vencedor = vencedor;
    }

    public Partida(int duracaoMinutos, String vencedor) {
        this.duracaoMinutos = duracaoMinutos;
        this.vencedor = vencedor;
    }
}
