package br.edu.unicesumar;

public class Main {
    public static void main(String[] args) {
        Sonda sonda = new Sonda("Sonda Bonita", 1.5, 1987,"Movimento");
        Foguete foguete = new Foguete("Foguete legal", 7,2010,1.5);

        Engenheiro rodolfo = new Engenheiro("Rodolfo","123456789");
        rodolfo.Inspecionar(sonda);

        Hangar hangar = new Hangar("Hangar",5);
        hangar.adicionarNave(sonda);
        hangar.adicionarNave(foguete);

        AgenciaEspacial agenciaEspacial = new AgenciaEspacial("Agência CVC", "CVC","Claudemiro");
        agenciaEspacial.adicionarHangar(hangar);

        System.out.println(sonda.getHangar().getNome());
    }
}
