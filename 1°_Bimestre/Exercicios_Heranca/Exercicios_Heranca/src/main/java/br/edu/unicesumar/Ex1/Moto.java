package br.edu.unicesumar.Ex1;

public class Moto extends Veiculo {

    private int cilindrada;

    public Moto(String marca, String modelo, int cilindrada){
        super(marca,modelo);
        this.cilindrada = cilindrada;
    }
}
