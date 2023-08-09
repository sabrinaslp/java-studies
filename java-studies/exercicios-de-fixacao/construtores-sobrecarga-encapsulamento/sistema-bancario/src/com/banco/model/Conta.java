package com.banco.model;

import java.util.Scanner;

public class Conta {

    private int numero;
    private String titular;
    private double saldo;
    private double valorDeposito, valorSaque;
    private Scanner input;

    public Conta(Scanner input) {
        this.input = input;
    }

    public void deposita(double valorDeposito) {
        saldo += valorDeposito;
    }

    public void saca(double valorSaque) {
        saldo = saldo - valorSaque - 5;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

}
