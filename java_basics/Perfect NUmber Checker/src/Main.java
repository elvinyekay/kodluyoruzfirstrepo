import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sumOfDivisors = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the to check is it a perfect number: ");
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Please enter a positive number");
            return;
        }

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sumOfDivisors += i;
            }
        }

        if (sumOfDivisors == number) {
            System.out.println("The number " + number + " is a perfect number");
        }else {
            System.out.println("The number " + number + " is not a perfect number");
        }
    }
}