import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int codigo = input.nextInt();
        int quantidade = input.nextInt();

        double total;

        if (codigo == 1) {
            total = quantidade * 4.00;
            System.out.println("Total: R$" + total);
        } else if (codigo == 2) {
            total = quantidade * 4.50;
            System.out.println("Total: R$" + total);
        } else if (codigo == 3) {
            total = quantidade * 5.00;
            System.out.println("Total: R$" + total);
        } else if (codigo == 4) {
            total = quantidade * 2.00;
            System.out.println("Total: R$" + total);
        } else if (codigo == 5) {
            total = quantidade * 1.50;
            System.out.println("Total: R$" + total);
        }

    }
}
