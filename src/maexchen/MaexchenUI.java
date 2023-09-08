package maexchen;

import java.util.Random;
import java.util.Scanner;

public class MaexchenUI {
    public static void main(String[] args) {
        Maexchen maexchen = new Maexchen();
        Random generator = new Random();
        int throw1 = generator.nextInt(6) + 1;
        int throw2 = generator.nextInt(6) + 1;
        //Scanner scanner = new Scanner(System.in);
        System.out.println("Erster Wurf: " + throw1);
       // int throw1 = scanner.nextInt();

        System.out.println("Zweiter Wurf: " + throw2);
        // int throw2 = scanner.nextInt();
        System.out.println("Punktzahl: " + maexchen.calculatePoints(throw1, throw2));
    }
}
