import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, hours;
        double valueHour, salary;

        System.out.println("Número do funcionário: ");
        number = input.nextInt();

        System.out.println("Horas trabalhadas: ");
        hours = input.nextInt();

        System.out.println("Valor que recebe por horas: ");
        valueHour = input.nextDouble();

        salary = (double) hours * valueHour;

        System.out.println("NUMBER = " + number);
        System.out.println("SALARY = U$ " + salary);

    }
}