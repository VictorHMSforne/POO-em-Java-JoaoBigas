package edu.Unicersumar.br;

public abstract class Funcionario {
    public String nome;
    public String cpf;
    public double salario;

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }
    public double getSalario() {
        return salario;
    }
    public abstract double getBonus() ; // Sintaxe da abstração
}
