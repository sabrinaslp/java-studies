package project;

import entities.Aluno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Aluno aluno = new Aluno();

        aluno.name = input.nextLine();
        aluno.nota1 = input.nextDouble();
        aluno.nota2 = input.nextDouble();
        aluno.nota3 = input.nextDouble();

        aluno.notaFinal();

    }
}