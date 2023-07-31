package project;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Employee funcionario = new Employee();
        System.out.print("Name: ");
        funcionario.name = input.nextLine();

        System.out.print("Gross salary: ");
        funcionario.grossSalary = input.nextDouble();

        System.out.print("Tax: ");
        funcionario.tax = input.nextDouble();

        System.out.println();
        System.out.println("Employee: " + funcionario);
        System.out.println();

        System.out.print("Which percentage to increase salary? ");
        double percentage = input.nextDouble();
        funcionario.increaseSalary(percentage);

        System.out.println();

        System.out.println("Updated data: " + funcionario);

        input.close();
    }
}