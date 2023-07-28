// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;

        System.out.println("Digite um número: ");
        number = input.nextInt();

        if (number % 2 == 0) { // Verifica se o número é par
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }

    }

}
