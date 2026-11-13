package br.edu.unicesumar;

public class ConexaoBancoException extends RuntimeException {
    public ConexaoBancoException() {
        super("Erro para conectar ao banco!");
    }
}
