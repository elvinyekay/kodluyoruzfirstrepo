import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, power, total = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to be raised to the power");
        number = sc.nextInt();

        System.out.println("Enter the power number");
        power = sc.nextInt();

        for (int i = 1; i <= power; i++) {
            total *= number;
        }

        System.out.println("Result: " + number + " ^ " + power + " = " + total);
    }
}