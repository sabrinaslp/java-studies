import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int alcool = 0, gasolina = 0, diesel = 0; // quantidade

        int tipoCombustivel = input.nextInt();

        while (tipoCombustivel != 4) {
            if (tipoCombustivel < 1 || tipoCombustivel > 5) {
                tipoCombustivel = input.nextInt();
            }

            if (tipoCombustivel == 1) {
                alcool += 1;
            } else if (tipoCombustivel == 2) {
                gasolina += 1;
            } else if (tipoCombustivel == 3) {
                diesel += 1;
            }
            tipoCombustivel = input.nextInt();
        }
        System.out.println("MUITO OBRIGADO!");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }
}