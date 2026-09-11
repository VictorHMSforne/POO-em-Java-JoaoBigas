package br.edu.unicesumar.Ex4;

public class ContaPoupanca extends ContaBancaria{
    private Double rendimento;

    public ContaPoupanca(Double saldo, String titular, Double rendimento){
        super(saldo,titular);
        this.rendimento = rendimento;
    }
}
