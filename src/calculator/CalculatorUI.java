package calculator;

import java.util.Scanner;

public class CalculatorUI {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.print("erste Zahl:");
        double number1 = scanner.nextDouble();
        System.out.print("zweite Zahl:");
        double number2 = scanner.nextDouble();
        System.out.print("Operator:");
        char operator = scanner.next().charAt(0);
        System.out.println(calc.calculateIfElse(number1, number2, operator));
    }
}
