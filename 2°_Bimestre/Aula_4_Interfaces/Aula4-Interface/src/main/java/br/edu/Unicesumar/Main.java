package br.edu.Unicesumar;

public class Main {
    public static void main(String[] args) {
        Gerente barbara = new Gerente("Barbarah","12345678-9",15000,"12345");
        Desenvolvedor matheus = new Desenvolvedor("Matheus","12345678-8",1600,"12345");
        Estagiario arthur = new Estagiario("Arthur","12345678-9",3500,"12345");

        barbara.baterPonto("12345");
        matheus.baterPonto("12345");
    }
}
