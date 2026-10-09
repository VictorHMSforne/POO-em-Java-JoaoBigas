package br.edu.unicesumar.Exercicio3;

public class Quadrado extends FormaGeometrica{
    public double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return  lado*lado;
    }
}
