package getMaximum;

import java.util.Scanner;

public class GetMaxUI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Erste Zahl: ");
        int number1 = scanner.nextInt();
        System.out.print("Zweite Zahl: ");
        int number2 = scanner.nextInt();
        System.out.print("Dritte Zahl: ");
        int number3 = scanner.nextInt();
        Maximum calc = new Maximum();
        System.out.println("Maximum: " + calc.getMaximum(number1, number2, number3));

    }
}
