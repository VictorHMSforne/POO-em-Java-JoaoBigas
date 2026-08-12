package br.edu.Unicesumar;

public class Veiculo {
    public String modelo;
    public String marca;
    public int anoFabricacao;

    public Veiculo(String marca, String modelo, int anoFabricacao){ // Esse aqui é o construtor, usado para não inicializar o projeto vazio
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao; // o this. faz referência a variável da classe
    }

    public void exibirDados(){
        System.out.printf("Marca %s | Modelo: %s | Ano de Fabricação: %d \n",
                this.marca, modelo, anoFabricacao); // O This pode ser usado para deixar o código mais limpo e auxiliar a entender que essa variável é da classe
    }
}

