package br.edu.unicesumar;

public class Gerente extends Funcionario{ // Extends é para herdar
    private String setorResponsavel;

    public Gerente(String nome, String cpf, Double salario,String setorResponsavel){
        super(nome,cpf,salario); // A palavra super identifica o construtor da classe pai
        this.setorResponsavel = setorResponsavel;
    }
}
