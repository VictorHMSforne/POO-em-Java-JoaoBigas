package br.edu.Unicesumar;

public class ValorMenorZeroException extends RuntimeException{
    public ValorMenorZeroException() {
        super("Valor Não pode ser menor que zero!");
    }
}
