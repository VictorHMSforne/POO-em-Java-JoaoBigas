package br.edu.unicesumar.Ex4;

public class ContaCorrente extends  ContaBancaria{
    private Double limiteCredito;

    public ContaCorrente(Double saldo, String titular, Double limiteCredito){
        super(saldo,titular);
        this.limiteCredito = limiteCredito;
    }
}
