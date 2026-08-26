package br.com.unicesumar;

public class Paciente {
    private String nome;
    private String cpf;

    public Paciente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void exibirDados(){
        System.out.println("PACIENTE:");
        System.out.printf("Nome: %s | CPF: %s", nome,cpf);
    }
}
