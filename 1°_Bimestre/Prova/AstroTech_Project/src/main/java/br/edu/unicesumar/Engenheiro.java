package br.edu.unicesumar;

public class Engenheiro {
    private String nome;
    private String crea;

    public Engenheiro(String nome){
        this.nome = nome;
    }

    public void Inspercionar(NaveEspacial veiculo){
        System.out.printf("\nO Engenheiro %s inspecionou a nave %s\n", nome,veiculo.getNome());
    }
}
