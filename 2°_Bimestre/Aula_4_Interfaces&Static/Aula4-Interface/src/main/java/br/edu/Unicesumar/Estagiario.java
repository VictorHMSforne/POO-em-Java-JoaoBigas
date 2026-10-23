package br.edu.Unicesumar;

public class Estagiario extends Funcionario{

    public Estagiario(String nome, String cpf, double salario, String matricula) {
        super(nome, cpf, salario, matricula);
    }

    @Override
    public double getBonus() {
        return getSalario() * 0.00001;
    }
}
