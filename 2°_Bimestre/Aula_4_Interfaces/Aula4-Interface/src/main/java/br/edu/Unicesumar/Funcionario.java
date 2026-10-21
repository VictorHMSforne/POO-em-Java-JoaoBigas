package br.edu.Unicesumar;

public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    private String matricula;

    public Funcionario(String nome, String cpf, double salario, String matricula) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }
    public abstract double getBonus();

    public String getMatricula() {
        return matricula;
    }
}
