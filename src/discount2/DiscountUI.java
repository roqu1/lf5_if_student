package discount2;

import java.util.Scanner;

public class DiscountUI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Discount discount = new Discount();
        System.out.print("Auftragshöhe: ");
        double amount = scanner.nextDouble();
        String response = discount.Discount2(amount);
        System.out.println("Endpreis: "+response);
    }
}
