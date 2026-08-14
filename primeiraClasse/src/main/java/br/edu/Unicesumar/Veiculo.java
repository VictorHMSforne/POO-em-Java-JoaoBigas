package br.edu.Unicesumar;

public class Veiculo {
    private String modelo;
    private String marca;
    private int anoFabricacao;
    private int qtdPortas;

    public Veiculo(String marca, String modelo, int anoFabricacao){ // Esse aqui é o construtor, usado para não inicializar o projeto vazio
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao; // o this. faz referência a variável da classe
        this.qtdPortas = 2;
        validarAnoFabricacao(anoFabricacao);
    }

    public int getQtdPortas(){
        return qtdPortas;
    }

    public String getMarca(){
        return marca;
    }
    public void setQtdPortas(int qtdPortas){
        if (qtdPortas > 0){
            this.qtdPortas = qtdPortas;
        }
    }

    public void setAnoFabricacao(int anoFabricacao){
        validarAnoFabricacao(anoFabricacao);
    }

    public void exibirDados(){
        System.out.printf("Marca %s | Modelo: %s | Ano de Fabricação: %d | Quantidade de portas: %d\n",
                this.marca, modelo, anoFabricacao, qtdPortas); // O This pode ser usado para deixar o código mais limpo e auxiliar a entender que essa variável é da classe
    }

    private void validarAnoFabricacao(int anoFabricacao){ //SOMENTE AQUI USA NA CLASSE, se eu instanciar não tem como usar. Ou seja quem usa esse carinha é o set
        if (anoFabricacao <= 1500){
            System.out.println("Valor inválido!");
        }
        setAnoFabricacao(anoFabricacao);
    }
}

