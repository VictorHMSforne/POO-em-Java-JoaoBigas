package br.edu.unicesumar;

public class Quarto {
    private String porta;
    private String cama;

    public Quarto(String porta, String cama){
        this.porta=porta;
        this.cama=cama;
    }

    public void setPorta(String porta) {
        this.porta = porta;
    }

    public String getPorta() {
        return porta;
    }
}

