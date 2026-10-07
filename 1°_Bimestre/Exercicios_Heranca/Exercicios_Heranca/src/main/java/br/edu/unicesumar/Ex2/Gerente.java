package br.edu.unicesumar.Ex2;

public class Gerente extends Funcionario{
    private String setor;


    public Gerente(String nome, Double salario, String setor){
        super(nome,salario);
        this.setor = setor;
    }
}
