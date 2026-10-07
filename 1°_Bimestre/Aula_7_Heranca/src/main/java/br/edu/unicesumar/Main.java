package br.edu.unicesumar;

public class Main {
    public static void main(String[] args) {
        Gerente Matheus = new Gerente("Matheus","123",2500.00,"TI");
        Matheus.registrarPonto();

        Desenvolvedor Kleber = new Desenvolvedor("Kleber","123",2500.00,"Java");

        Funcionario[] funcionarios = new Funcionario[2];
        funcionarios[0] = Matheus;
        funcionarios[1] = Kleber;

        for(int i = 0; i<2; i++){
            System.out.printf("Funcionário: %s - salário: %.2f - \n", funcionarios[i].getNome(), funcionarios[i].registrarFolha());

        }


    }
}
