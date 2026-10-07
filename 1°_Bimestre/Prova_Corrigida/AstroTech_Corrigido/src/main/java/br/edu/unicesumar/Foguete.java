package br.edu.unicesumar;

public class Foguete extends NaveEspacial{
    private double capacidadeCarga;

    public Foguete(String nome, double pesoToneladas, int anoFabricacao, double capacidadeCarga) {
        super(nome, pesoToneladas, anoFabricacao);
        this.capacidadeCarga = capacidadeCarga;
    }
}
