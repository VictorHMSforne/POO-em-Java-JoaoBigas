package br.edu.unicesumar.Ex2;

public class Estagiario extends Funcionario{

    private Double cargaHoraria;

    public Estagiario(String nome, Double salario, Double cargaHoraria){
        super(nome, salario);
        this.cargaHoraria = cargaHoraria;
    }
}
