package br.edu.unicesumar;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Casa casa1 = new Casa("Rua 7", "Branca", "Casal");

        System.out.println(casa1.getQuartoPrincipal().getPorta());
        System.out.println(casa1.getGaragem());

        casa1.construirGaragem(8);

        System.out.println(casa1.getGaragem());

        casa1.atualizarQuartoPrincipal(null, null);
        casa1.setPortaQuatoPrincipal("Marrom");


        System.out.println(casa1.getQuartoPrincipal().getPorta());


        Monitor acer = new Monitor();

        Computador dell = new Computador();

        dell.conectarMonitor(acer);

    }
}
