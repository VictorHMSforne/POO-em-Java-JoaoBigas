package br.edu.unicesumar;

public class Main {
    public static void main(String[] args) {
        Sonda hubble = new Sonda("Hubble",-10.00,1998,"Calor");
        Foguete apolo12 = new Foguete("Apolo-12",12,2000,500.00);

        Engenheiro cleberiano = new Engenheiro("Cleberiano");
        cleberiano.Inspercionar(hubble);

        Hangar hangar = new Hangar("A-15",5);
        hangar.adicionarNave(hubble);
        hangar.adicionarNave(apolo12);

        AgenciaEspacial watson = new AgenciaEspacial("Watson","WTS");
        watson.adicionarHangar(hangar);

        //System.out.printf("%s", hubble.getHangar());
       // hubble.getHangar().toString();
    }
}
