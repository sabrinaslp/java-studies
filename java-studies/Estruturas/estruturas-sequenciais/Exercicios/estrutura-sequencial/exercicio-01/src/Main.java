/* Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma
desses números com uma mensagem explicativa, conforme exemplos. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, resultado;

        System.out.println("Digite um valor: ");
        a = input.nextInt();

        System.out.println("Digite outro valor: ");
        b = input.nextInt();

        resultado = a + b;

        System.out.println("SOMA = " + resultado);
    }
}