package br.edu.Unicesumar;

import java.sql.SQLOutput;

public class Desenvolvedor extends Funcionario implements ControlePonto{

    private String linguagemPrincipal;

    public Desenvolvedor(String nome, String cpf, double salario, String matricula) {
        super(nome, cpf, salario, matricula);
    }

    @Override
    public double getBonus() {
        return getSalario() * 0.20;
    }

    @Override
    public void baterPonto(String matricula) {
        if(matricula.equals(matricula)){
            System.out.println("Ponto efetuado");
        }
        else
            System.out.println("Matrícula inválida");

    }
}
