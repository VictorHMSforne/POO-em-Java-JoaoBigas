package com.br.unicesumar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();

        System.out.println("Insira o nome da pessoa: ");
        Scanner scan = new Scanner(System.in);
        String nome = scan.nextLine();
        p1.setNome(nome);

        System.out.printf("Insira a idade de %s: ",nome);
        int idade = scan.nextInt();
        p1.setIdade(idade);

        System.out.printf("O nome digitado foi: %s\n", p1.getNome());
        System.out.printf("A Idade  é: %s", p1.getIdade());
    }
}
