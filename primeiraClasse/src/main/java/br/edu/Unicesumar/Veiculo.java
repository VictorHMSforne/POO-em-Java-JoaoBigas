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
    }

    public int verQtdPortas(){
        return qtdPortas;
    }

    public void alterarQtdPortas(int valorNovo){
        qtdPortas = valorNovo;
    }




    public void exibirDados(){
        System.out.printf("Marca %s | Modelo: %s | Ano de Fabricação: %d | Quantidade de portas: %d\n",
                this.marca, modelo, anoFabricacao, qtdPortas); // O This pode ser usado para deixar o código mais limpo e auxiliar a entender que essa variável é da classe
    }
}

