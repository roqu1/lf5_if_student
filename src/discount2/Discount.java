package discount2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Discount {
    public String Discount2(double amount) {
        String pattern = "###,###.## €";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        if (amount < 100) {
            System.out.println("Porto: 2,00 Euro");
            amount += 2;
        }
        if (amount < 250) {
            System.out.println("Verpackungszuschlag: 5,00 EUR");
            amount += 5;
        }
        if (amount >= 500) {
            System.out.println("5% Rabatt");
            amount -= (int) (amount * 0.05);
        }
        return decimalFormat.format(amount);
    }
}
