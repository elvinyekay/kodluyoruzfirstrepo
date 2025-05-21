import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double pricePerKM = 0.10;
        int distance, age, typeOfTrip;
        double totalCost, discount = 0, tripDiscount = 0;

        System.out.println("Enter the distance(km): ");
        distance = sc.nextInt();

        System.out.println("Enter the age: ");
        age = sc.nextInt();

        System.out.println("Enter the type of trip(1 => one way,  2 => two way): ");
        typeOfTrip = sc.nextInt();

        if (distance < 0 || age < 0 || typeOfTrip < 1 || typeOfTrip > 2) {
            System.out.println("Invalid input");
        } else {
            totalCost = distance * pricePerKM;
            System.out.println("Normal cost: " + totalCost);

            if (age < 12) {
                discount = totalCost * 0.5;
            }
            if (age >= 12 && age <= 24) {
                discount = totalCost * 0.10;
            }
            if (age > 65) {
                discount = totalCost * 0.30;
            }
            if (age > 24 && age <= 65) {
                discount = 0;
            }

            System.out.println("Age discount: " + discount);
            totalCost = totalCost - discount;

            if (typeOfTrip == 2) {
                tripDiscount = totalCost * 20 / 100;
                totalCost = (totalCost - tripDiscount) * 2;
            }

            System.out.println("Trip discount: " + tripDiscount);
            System.out.println("Total cost: " + totalCost);
        }
    }
}