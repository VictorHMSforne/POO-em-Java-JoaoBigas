package br.edu.unicesumar;

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

    public int getId() {
        return id;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public String getVencedor() {
        return vencedor;
    }

    @Override
    public String toString() {
        return "Partida{" +
                "id=" + id +
                ", duracaoMinutos=" + duracaoMinutos +
                ", vencedor='" + vencedor + '\'' +
                '}';
    }
}
