package br.edu.Unicesumar;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua idade");
        try {
            int valorDigitado = scan.nextInt();
            if (valorDigitado<=0){
                throw new  ValorMenorZeroException();
            }
            System.out.printf("Sua idade é: %d\n", valorDigitado);
        }catch (InputMismatchException exception){

            JOptionPane.showMessageDialog(null, "mensagem","Teste",JOptionPane.ERROR_MESSAGE);
            scan.close();

        }


        System.out.println("Fim do código");
    }
}
