package br.com.unicesumar;

public class Medico {
    private String nome;
    private String crm;
    private Consulta[] consultas;
    private int proximaPosicaoLivre;

    public Medico(String nome, String crm) {
        this.nome = nome;
        this.crm = crm;
        consultas = new Consulta[10];
        proximaPosicaoLivre = 0;
    }

    public String getNome() {
        return nome;
    }
    public void exibirDados(){
        System.out.println("MÉDICO");
        System.out.printf("NOME: %s | CRM: %s", nome, crm);
        for (int i = 0;i<10;i++){
            if (consultas[i] )
            System.out.printf("Consulta[%d]\n", i+1);
            System.out.println("----------------\n");
            consultas[i].exibirDados();
        }
    }

    public void addConsulta(Consulta consulta){
        if (this.proximaPosicaoLivre >= 10){
            System.out.println("Limite de consulta Atingido");

        }else{
            this.consultas[this.proximaPosicaoLivre] = consulta;
            this.proximaPosicaoLivre++;
        }
    }

}
