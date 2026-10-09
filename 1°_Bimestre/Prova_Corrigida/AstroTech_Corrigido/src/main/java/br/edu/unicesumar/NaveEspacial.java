package br.edu.unicesumar;

public class NaveEspacial {
    private String nome;
    private double pesoToneladas;
    private int anoFabricacao;
    private Hangar hangar;

    public NaveEspacial(String nome, double pesoToneladas, int anoFabricacao) {
        this.nome = nome;
        if(pesoToneladas > 0){
            this.pesoToneladas = pesoToneladas;
        }
        else{
            this.pesoToneladas = 0;
        }

        this.anoFabricacao = anoFabricacao;
    }

    public String getNome(){
        return nome;
    }

    public void setHangar(Hangar hangar){
        this.hangar = hangar;
    }

    public Hangar getHangar() { return hangar; }

}
