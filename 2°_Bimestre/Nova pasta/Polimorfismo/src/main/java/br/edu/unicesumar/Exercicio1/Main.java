package br.edu.unicesumar.Exercicio1;

public class Main {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo();
        Carro carro = new Carro();
        Moto moto = new Moto();


        System.out.println(veiculo.calcularPedagio());
        System.out.println(carro.calcularPedagio());
        System.out.println(moto.calcularPedagio());
    }
}
