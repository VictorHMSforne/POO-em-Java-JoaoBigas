package br.edu.unicesumar;

import java.lang.reflect.Array;

public class Hangar {
    private String nome;
    private int capacidadeMaxima;
    private NaveEspacial naveEspacial;
    private int contadorAux = 0;

    public Hangar(String nome,int capacidadeMaxima){
       this.nome = nome;
       this.capacidadeMaxima = capacidadeMaxima;


    }

    public void adicionarNave(NaveEspacial naveEspacial){

        if (contadorAux <= capacidadeMaxima){

            setNave(naveEspacial);
            //capacidadeMaxima = 1;
            contadorAux++;
        }else{
            System.out.println("HANGAR CHEIO");
        }

    }

    public void setNave(NaveEspacial nave){
        naveEspacial = nave;
    }

    public String getHangar(NaveEspacial naveEspacial){
        return naveEspacial.getHangar(this);
    }



}
