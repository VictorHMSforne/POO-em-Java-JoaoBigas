package edu.Unicersumar.br;

public class Estagiario extends Funcionario{

    public Estagiario(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public double getBonus() {
        return salario*0.15;
    }
}
