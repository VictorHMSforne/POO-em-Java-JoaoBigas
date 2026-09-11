package br.edu.unicesumar.Ex3;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Elefante");
        animal.fazerSom();

        Cachorro dog = new Cachorro("Dogzeira");
        dog.fazerSom();

        Gato cat = new Gato("Catzeira");
        cat.fazerSom();
    }
}
