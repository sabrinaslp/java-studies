import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int senha = input.nextInt();

        while (senha != 2002) {
            System.out.println("Senha inválida");
            senha = input.nextInt();
        }

        if (senha == 2002) {
            System.out.println("Acesso permitido.");
        }
    }
}


