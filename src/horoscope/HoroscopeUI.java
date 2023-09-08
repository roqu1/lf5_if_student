package horoscope;

import java.util.Scanner;

public class HoroscopeUI {
    public static void main(String[] args) {
        Horoscope horoscope = new Horoscope();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tag: ");
        int day = scanner.nextInt();
        System.out.print("Monat: ");
        int month = scanner.nextInt();
        System.out.println(horoscope.getHoroscope(day, month));

    }
}
