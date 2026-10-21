package br.edu.Unicesumar;

import java.io.Serializable;

public class Gerente extends Funcionario implements ControlePonto {

    private String setorResponsavel;

    public Gerente(String nome, String cpf, double salario, String matricula) {
        super(nome, cpf, salario,matricula);
    }

    @Override
    public double getBonus() {
        return getSalario() * 0.15;
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
