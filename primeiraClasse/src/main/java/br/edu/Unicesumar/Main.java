package br.edu.Unicesumar;

public class Main {
    public static void main(String[] args) {

        Veiculo celta = new Veiculo("GM Chevy", "Celta", 2007);

        /*celta.modelo = "celta";
        celta.marca = "GM Chevy";
        celta.anoFabricacao = 2007;
        FOI PARA O CONSTRUTOR
        */

        System.out.println("Veículo");

       /* System.out.printf("Marca %s | Modelo: %s | Ano de Fabricação %d",
                            celta.marca, celta.modelo, celta.anoFabricacao);
        AQUI FOI MUDADO PARA UM MÉTODOO: EXIBIR DADOS
                            */
        celta.exibirDados();

        Veiculo fiatArgo = new Veiculo("Fiat", "Argo",2022);
        fiatArgo.exibirDados();

        fiatArgo.setAnoFabricacao(1300);

    }
}
