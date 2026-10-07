package br.edu.unicesumar;

public class Main {
    public static void main(String[] args) {
        Aluno rodolfo = new Aluno("Rodolfo Silvão","123456");
        Aluno xuliana = new Aluno("Xuliana Silvinha","123456789");
        Aluno cleberiani = new Aluno("Cleberiani Jonh","12345678");

        Turma esoft = new Turma("Engenharia de Software");

        esoft.addDisciplina("POO");
        esoft.addDisciplina("SO");
        esoft.addDisciplina("BD");

        esoft.addAluno(rodolfo);
        esoft.addAluno(xuliana);
        esoft.addAluno(cleberiani);

        int tamanhoTurma = esoft.getAlunos().size();

        System.out.println("=======================");
        System.out.printf(" TURMA: %s \n", esoft.getNome());

        for (int i=0;i < tamanhoTurma; i++ ){

            Aluno aluno = esoft.getAluno(i);

            System.out.printf("Aluno [ %d ]: %s\n",i+1, aluno.getNome());

        }


    }
}
