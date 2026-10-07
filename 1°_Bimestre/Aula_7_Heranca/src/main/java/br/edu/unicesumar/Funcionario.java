package br.edu.unicesumar;

public class Funcionario {
    private String nome;
    private String cpf;
    private Double salario;

    public Funcionario(String nome, String cpf, Double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = 2500.00;
    }

    public void registrarPonto(){
        System.out.printf("Ponto Registrado | Funcionário: %s",nome);
    }

    public Double registrarFolha(){
        return salario;
    }

    public String getNome(){
        return  nome;
    }
}
