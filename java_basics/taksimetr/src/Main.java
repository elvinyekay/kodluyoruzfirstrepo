import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * Taksimetre KM başına 2.20 TL tutmaktadır.
         * Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
         * Taksimetre açılış ücreti 10 TL'dir.
         */

        double distance, amountPerKM, totalAmount;
        int startingFee = 10;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter distance traveled km:");
        distance = scanner.nextDouble();
        amountPerKM = 2.20;
        totalAmount = (amountPerKM * distance) + startingFee;

        if (totalAmount < 20) {
            totalAmount = 20;
        }

        System.out.println("Total amount: " + totalAmount);
    }
}