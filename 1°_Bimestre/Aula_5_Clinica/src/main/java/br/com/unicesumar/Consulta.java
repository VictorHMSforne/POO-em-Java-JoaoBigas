package br.com.unicesumar;

public class Consulta {
    private String data;
    private String hora;
    private Medico medico;
    private Paciente paciente;


    public Consulta(String data, String hora, Medico medico, Paciente paciente) {
      this.data = data;
      this.hora = hora;
      this.medico = medico;
      this.paciente = paciente;
      this.medico.addConsulta(this);
    }

    public void exibirDados(){
        System.out.println("CONSULTAS");
        System.out.printf("Data/Hora: %s - %s | Medico: %s | Paciente: %s",
                data,hora,medico.getNome(),paciente.getNome()); //Aqui precisa colocar getNome, pois se não aparece o endereço de memória
    }
}
