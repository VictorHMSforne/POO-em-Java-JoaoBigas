package br.edu.unicesumar;

public class Hangar {
    private String nome;
    private int capacidadeMaxima;
    private NaveEspacial[] naves;

//    private int proximaPosicao; // Esqueci disso

    public Hangar(String nome, int capacidadeMaxima) {
        this.nome = nome;
        this.capacidadeMaxima = capacidadeMaxima;

        this.naves = new NaveEspacial[capacidadeMaxima]; // Não fiz isso na prova, faltou
//        this.proximaPosicao=0;
    }
    
    public String getNome(){
        return nome;
    }

    public int getCapacidadeMaxima(){
        return this.naves.length;
    }

    // Da para fazer dessa maneira

//    public void adicionarNave(NaveEspacial nave){
//        if (proximaPosicao<capacidadeMaxima){
//            this.naves[proximaPosicao] = nave;
//            proximaPosicao++;
//        }
//    }

    public void adicionarNave(NaveEspacial nave){
        if (capacidadeMaxima > 0){
            capacidadeMaxima --;
            this.naves[capacidadeMaxima] = nave;
            nave.setHangar(this);
        }
    }
}
