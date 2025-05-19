import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double height, weight, massIndex;

        System.out.println("Enter your height (in meters): ");
        height = scanner.nextDouble();

        System.out.println("Enter your weight: ");
        weight = scanner.nextDouble();

        massIndex = weight / (height * height);
        System.out.println("Your Body Mass Index is:" + massIndex);
    }
}