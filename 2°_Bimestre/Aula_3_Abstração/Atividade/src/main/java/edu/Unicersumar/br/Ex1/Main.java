package edu.Unicersumar.br.Ex1;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Moto moto = new Moto();

        System.out.printf("O Valor do Seguro do carro é: %.2f \n", carro.calcularSeguro());
        System.out.printf("O Valor do Seguro do moto é: %.2f", moto.calcularSeguro());
    }
}
