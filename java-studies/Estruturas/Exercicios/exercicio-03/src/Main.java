import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A, B, C, D;
        int diferenca;

        System.out.println("Digite 4 valores: ");
        A = input.nextInt();
        B = input.nextInt();
        C = input.nextInt();
        D = input.nextInt();

        diferenca = (A * B - C * D);

        System.out.println("DIFERENCA: " + diferenca);

    }
}