package br.edu.unicesumar;

public class NaveEspacial {
    private String nome;
    private double pesoToneladas;
    private int anoFabricacao;


    public NaveEspacial(String nome, double pesoToneladas, int anoFabricacao){
        this.nome = nome;
        this.anoFabricacao = anoFabricacao;

        if (pesoToneladas < 0.0)
            this.pesoToneladas = 0.0;
    }

    public String getNome(){
        return nome;
    }


    public Hangar setHangar(Hangar hangar){
        return hangar;
    }



    public String getHangar(Hangar hangar){
        return hangar.getHangar(this).toString();
    }



}
