package br.edu.unicesumar.Exercicio3;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(10);
        Quadrado quadrado = new Quadrado(5);

        System.out.println(circulo.calcularArea());
        System.out.println(quadrado.calcularArea());
    }

}
