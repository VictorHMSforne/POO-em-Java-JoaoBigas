package br.edu.unicesumar;

import java.util.ArrayList;

public class AgenciaEspacial {
    private String nome;
    private String sigla;
    private ArrayList<Hangar> hangares;

    public AgenciaEspacial(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
        CentroControle centroControle = new CentroControle();
        this.hangares = new ArrayList<>();
    }

    public void adicionarHangar(Hangar hangar){
        hangares.add(hangar);
        System.out.println("Hangar Criado com sucesso");
    }
}
