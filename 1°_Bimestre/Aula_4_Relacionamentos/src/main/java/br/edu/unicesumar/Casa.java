package br.edu.unicesumar;

public class Casa {
    private String endereco;
    private Quarto quartoPrincipal;
    private Garagem garagem;

    public Casa(String endereco, String porta, String cama){
        this.endereco=endereco;
        this.quartoPrincipal= new Quarto(porta, cama);
    }

    private void setQuartoPrincipal(Quarto quartoPrincipal) {
        this.quartoPrincipal = quartoPrincipal;
    }

    private void setGaragem(Garagem garagem) {
        this.garagem = garagem;
    }

    public Quarto getQuartoPrincipal() {
        return quartoPrincipal;
    }

    public Garagem getGaragem() {
        return garagem;
    }

    public void atualizarQuartoPrincipal(String porta, String cama){
        setQuartoPrincipal(new Quarto(porta, cama));
    }

    public void construirGaragem(int qtdCarros){
        setGaragem(new Garagem(4));
    }

    public void setPortaQuatoPrincipal(String porta){
        this.quartoPrincipal.setPorta(porta);
    }
}
