package sort;

import java.util.Scanner;

public class SortUI {
    public static void main(String[] args) {
        Sort sort = new Sort();
        Scanner scanner = new Scanner(System.in);
        System.out.print("erste große: ");
        double size1 = scanner.nextDouble();
        System.out.print("zweite große: ");
        double size2 = scanner.nextDouble();
        System.out.print("dritte große: ");
        double size3 = scanner.nextDouble();
        System.out.println(sort.sort(size1, size2, size3));
    }
}
