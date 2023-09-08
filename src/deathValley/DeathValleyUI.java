package deathValley;

import java.util.Scanner;

public class DeathValleyUI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tankkapazität:");
        int capacity = scanner.nextInt();
        System.out.print("Benzinanzeige:");
        int gasDisplay = scanner.nextInt();
        System.out.print("Verbrauch:");
        double consumption = scanner.nextDouble();
        Tank tank = new Tank();
        boolean result = tank.enoughGas(capacity, gasDisplay, consumption);
        if (result) {
            System.out.println("Weiterfahren!");
        } else {
            System.out.println("Tanken!");
        }
    }
}
