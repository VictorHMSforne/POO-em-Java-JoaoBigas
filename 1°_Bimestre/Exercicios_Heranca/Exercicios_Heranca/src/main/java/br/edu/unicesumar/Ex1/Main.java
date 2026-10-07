package br.edu.unicesumar.Ex1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Veiculo corsa = new Veiculo("GM Chevy", "Corsa Hatch");
        corsa.exibirInformacoes();

        Carro ram = new Carro("RAM", "Monster Truck",4);
        ram.exibirInformacoes();

        Moto bros = new Moto("Bros","Honda", 160);
        bros.exibirInformacoes();
    }
}