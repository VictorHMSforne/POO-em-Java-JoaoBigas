package edu.Unicersumar.br;

public class Desenvolvedor extends Funcionario{

    public String linguagemPrincipal;

    public Desenvolvedor(String nome, String cpf, double salario, String linguagemPrincipal) {
        super(nome, cpf, salario);
        this.linguagemPrincipal = linguagemPrincipal;
    }

    @Override
    public double getBonus() {
        return salario*0.15;
    }
}
