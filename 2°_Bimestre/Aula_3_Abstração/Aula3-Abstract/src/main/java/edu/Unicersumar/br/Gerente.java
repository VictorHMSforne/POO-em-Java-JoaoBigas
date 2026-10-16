package edu.Unicersumar.br;

public class Gerente extends Funcionario{
    public String setorResponsavel;

    public Gerente(String nome, String cpf, double salario, String setorResponsavel) {
        super(nome, cpf, salario);
        this.setorResponsavel = setorResponsavel;
    }

    @Override
    public double getBonus() {
        return salario*0.3;
    }
}
