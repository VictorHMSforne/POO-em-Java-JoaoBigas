package br.edu.unicesumar;

public class Engenheiro {
    private String nome;
    private String crea;

    public Engenheiro(String nome, String crea) {
        this.nome = nome;
        this.crea = crea;
    }

    public void Inspecionar(NaveEspacial veiculo){
        System.out.printf("O engenheiro %s inespecionou a nave %s", this.nome,veiculo.getNome());

    }
}
