package br.edu.unicesumar;

import java.util.ArrayList;

public class AgenciaEspacial {
    private String nome;
    private String sigla;
    private CentroControle centroControle;
    private ArrayList<Hangar> hangares;

    public AgenciaEspacial(String nome, String sigla, String nomeDiretor) {
        this.nome = nome;
        this.sigla = sigla;
        this.centroControle = new CentroControle(nomeDiretor); // Criação e utilização da composição
        this.hangares = new ArrayList<>();
    }

    public void adicionarHangar(Hangar hangar){
        this.hangares.add(hangar);
    }
}
