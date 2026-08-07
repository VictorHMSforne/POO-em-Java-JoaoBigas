package br.com.Unicesumar;

import java.util.Scanner;

public class Exc_1 {
    public static void main(String[] args){
        /*
        ============
        1.1
        ============
        System.out.print("Digite um número: ");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        System.out.printf("O Número que você digitou é %d",number);

        ============
        1.2
        ============

        System.out.println("===============");
        System.out.println(" Tela de Login ");
        System.out.println("===============");
        System.out.print("\n");
        System.out.println("Digite seu nome: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine(); // O Next Line Pega toda linha | Somente o NEXT pega o conjunto de caracteres
        System.out.printf("Seja BEM-VINDO! %s", name);

        ============
        1.3
        ============

        System.out.println("===============");
        System.out.println("   CALCULATOR  ");
        System.out.println("===============");
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o 1° Número: ");
        int number1 = scan.nextInt();
        System.out.println("Digite o 2° Número: ");
        int number2 = scan.nextInt();
        System.out.printf("RESULTADO: %d ", number1 + number2 );

         */

        System.out.println("================");
        System.out.println(" CALCULATOR 2.0 ");
        System.out.println("================");
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o 1° N. : ");
        int n1 = scan.nextInt();
        System.out.println("Digite o 2° N. : ");
        int n2 = scan.nextInt();
        System.out.println("Digite o 3° N. : ");
        int n3 = scan.nextInt();

        double media = (n1+n2+n3) / 3.0;

        System.out.printf("A Média Aritmética é : %f", media);


    }
}
