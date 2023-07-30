import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i = 1; i <= n; i ++) {
            int linha = i;
            int quadrado = i * i;
            int cubo = i * i * i;

            System.out.printf("%d %d %d%n", linha, quadrado, cubo);

        }

    }
}