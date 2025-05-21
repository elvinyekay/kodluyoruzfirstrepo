import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double pricePerKM = 0.10, discount50 = 0.5, discount10 = 0.10,discount30 = 0.30, discount20 = 0.20;
        int distance, age, typeOfTrip;
        double totalCost, discount, tripDiscount;

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
                discount = totalCost * discount50;
            }else if (age <= 24) {
                discount = totalCost * discount10;
            }else if (age > 65) {
                discount = totalCost * discount30;
            }else {
                discount = 0;
            }

            System.out.println("Age discount: " + discount);
            totalCost = totalCost - discount;

            if (typeOfTrip == 2) {
                tripDiscount = totalCost * discount20;
                System.out.println("Trip discount: " + tripDiscount);
                totalCost = (totalCost - tripDiscount) * 2;
            }

            System.out.println("Total cost: " + totalCost);
        }
    }
}