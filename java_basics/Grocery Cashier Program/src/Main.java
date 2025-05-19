import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double pearPrice = 2.14;
        final double applePrice = 3.67;
        final double tomatoPrice = 1.11;
        final double bananaPrice = 0.95;
        final double eggplantPrice = 5.0;
        double pearKg, appleKg, tomatoKg, bananaKg, eggplantKg,totalAmount;

        System.out.println("Pear kg: ");
        pearKg = scanner.nextInt();
        System.out.println("Apple kg: ");
        appleKg = scanner.nextInt();
        System.out.println("Tomato kg: ");
        tomatoKg = scanner.nextInt();
        System.out.println("Banana kg: ");
        bananaKg = scanner.nextInt();
        System.out.println("Eggplant kg: ");
        eggplantKg = scanner.nextInt();

        totalAmount =
                (pearKg * pearPrice) + (appleKg * applePrice) + (tomatoKg * tomatoPrice) + (bananaKg * bananaPrice) + (eggplantKg * eggplantPrice);

        System.out.println("Total amount:" + totalAmount);
    }
}