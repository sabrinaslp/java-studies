import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double raio, area;

        System.out.println("Insira o valor do raio: ");
        raio = input.nextDouble();

        area = 3.14159 * raio * raio;

        System.out.printf("%.4f%n", area);

    }
}