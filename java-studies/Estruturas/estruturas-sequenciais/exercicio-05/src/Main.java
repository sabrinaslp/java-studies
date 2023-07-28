import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int code1, number1, code2, number2;
        double value1, value2, sum;

        code1 = input.nextInt();
        number1 = input.nextInt();
        value1 = input.nextDouble();

        code2 = input.nextInt();
        number2 = input.nextInt();
        value2 = input.nextDouble();

        sum = (value1*number1) + (value2*number2);

        System.out.printf("VALOR A PAGAR: R$ %.2f", sum);




    }
}