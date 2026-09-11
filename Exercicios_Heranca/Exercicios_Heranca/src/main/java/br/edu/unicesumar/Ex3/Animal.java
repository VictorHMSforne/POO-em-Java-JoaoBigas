package br.edu.unicesumar.Ex3;

public class Animal {
    private String nome;

    public Animal(String nome){
        this.nome = nome;
    }

    // Aqui é polimorfismo

    public void fazerSom(){
        System.out.println("Som do animal");
    }
}
