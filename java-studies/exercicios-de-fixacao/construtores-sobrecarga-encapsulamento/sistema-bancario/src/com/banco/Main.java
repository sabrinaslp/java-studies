package com.banco;

import com.banco.model.Conta;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Conta conta = new Conta(input);

        System.out.println("Informe o número da conta: ");
        conta.setNumero(input.nextInt());
        input.nextLine();

        System.out.println("Informe o nome do titular da conta: ");
        conta.setTitular(input.nextLine());

        System.out.println("Irá realizar o depósito inicial (s/n) ?");
        char opcao = input.next().charAt(0);

        if (opcao == 's') {
            System.out.println("Informe o valor depósito inicial: ");
            conta.deposita(input.nextDouble());
        }

        System.out.println("DADOS DA CONTA:");
        System.out.printf("Conta: %d, Titular: %s, Saldo: $ %.2f%n", conta.getNumero(), conta.getTitular(), conta.getSaldo());

        System.out.println("Informe o valor do depósito: ");
        conta.deposita(input.nextDouble());

        System.out.println("CONTA ATUALIZADA:");
        System.out.printf("Conta: %d, Titular: %s, Saldo: $ %.2f%n", conta.getNumero(), conta.getTitular(), conta.getSaldo());

        System.out.println("Informe o valor de saque: ");
        conta.saca(input.nextDouble());

        System.out.println("CONTA ATUALIZADA:");
        System.out.printf("Conta: %d, Titular: %s, Saldo: $ %.2f%n", conta.getNumero(), conta.getTitular(), conta.getSaldo());

        input.close();

    }
}