package br.edu.unicesumar;

public class NaveEspacial {
    private String nome;
    private double pesoToneladas;
    private int anoFabricacao;

    public NaveEspacial(String nome, double pesoToneladas, int anoFabricacao) {
        this.nome = nome;
        if(pesoToneladas > 0){
            this.pesoToneladas = pesoToneladas;
        }
        else{
            this.pesoToneladas = 0;
        }
        this.pesoToneladas = pesoToneladas;
        this.anoFabricacao = anoFabricacao;
    }

    public String getNome(){
        return nome;
    }

}
