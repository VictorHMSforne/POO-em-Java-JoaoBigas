package br.com.unicesumar;

public class Main {
    public static void main(String[] args) {
        Medico medico = new Medico("Antonino Silva", "1234567879");
        medico.exibirDados();

        Paciente paciente = new Paciente("Carlos Cruz", "987465123");
        paciente.exibirDados();

        Consulta rotina = new Consulta("25/08/26", "16:32", medico, paciente);
    }
}
