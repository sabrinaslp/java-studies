import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int in = 0;
        int out = 0;

        for (int i = 0; i < n; i++) {
            int x = input.nextInt();

            if (x >= 10 && x <= 20) {
                in += 1;
            }

            else {
                out += 1;
            }

        }

        System.out.println(in + " in");
        System.out.println(out + " out");

    }
}