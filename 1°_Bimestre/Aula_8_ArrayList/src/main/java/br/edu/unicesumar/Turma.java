package br.edu.unicesumar;

import java.util.ArrayList;

public class Turma {
    private String nome;
    private ArrayList<String> disciplinas;
    private ArrayList<Aluno> alunos;


    public Turma(String nome){
        this.nome = nome;
        this.disciplinas = new ArrayList<String>(); //Posso ou não colocar String dentro de <>
        this.alunos = new ArrayList<>();
    }

    public ArrayList<Aluno> getAlunos(){
        return alunos;
    }

    public void addAluno(Aluno aluno){
        this.alunos.add(aluno);
    }

    public void addDisciplina(String disciplina){
        this.disciplinas.add(disciplina);
    }

    public void removeAluno(int index){
        this.alunos.remove(index);
    }

    public Aluno getAluno(int index){
        return this.alunos.get(index);
    }
    public String getNome(){
        return  nome;
    }

}
