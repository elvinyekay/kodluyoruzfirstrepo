import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int selectedNumber;

        String menu = """
                1 - Addition
                2 - Subtraction
                3 - Multiplication
                4 - Division
                5 - Power calculation
                6 - Factorial calculation
                7 - Modulo operation
                8 - Rectangle area and perimeter calculation
                0 - Exit""";

        do {
            System.out.println(menu);
            System.out.println("Enter your choice: ");
            selectedNumber = scanner.nextInt();

            switch (selectedNumber) {
                case 1 -> sum(scanner);
                case 2 -> subtract(scanner);
                case 3 -> multiply(scanner);
                case 4 -> divide(scanner);
                case 5 -> power(scanner);
                case 6 -> factorial(scanner);
                case 7 -> modulo(scanner);
                case 8-> calcAreaAndPerimeter(scanner);
                default -> System.out.println("Please enter a valid number");
            }
        } while (selectedNumber != 0);
    }

    public static void sum(Scanner scanner) {
        System.out.println("Enter first number: ");
        double a = scanner.nextDouble();
        System.out.println("Enter second number: ");
        double b = scanner.nextDouble();
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    public static void subtract(Scanner scanner) {
        System.out.println("Enter first number: ");
        double a = scanner.nextDouble();
        System.out.println("Enter second number: ");
        double b = scanner.nextDouble();
        System.out.println(a + " - " + b + " = " + (a - b));
    }

    public static void multiply(Scanner scanner) {
        System.out.println("Enter first number: ");
        double a = scanner.nextDouble();
        System.out.println("Enter second number: ");
        double b = scanner.nextDouble();
        System.out.println(a + " * " + b + " = " + (a * b));
    }

    public static void divide(Scanner scanner) {
        System.out.println("Enter first number: ");
        double a = scanner.nextDouble();
        System.out.println("Enter second number: ");
        double b = scanner.nextDouble();
        if (b == 0){
            System.out.println("Error: Divide by zero");
        }else {
            System.out.println(a + " / " + b + " = " + (a / b));
        }
    }

    public static void power(Scanner scanner) {
        System.out.println("Enter first number: ");
        double num = scanner.nextDouble();
        System.out.println("Enter second number: ");
        double pow = scanner.nextDouble();
        double result = 1;
        for (int i = 0; i < pow; i++) {
            result *= num;
        }

        System.out.println(num + " raised to the power of " + pow + " is: " + result);
    }

    public static void factorial(Scanner scanner) {
        System.out.println("Enter factorial number: ");
        int num = scanner.nextInt();
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + num + " is: " + fact);
    }

    public static void modulo(Scanner scanner) {
        System.out.println("Enter first number: ");
        double a = scanner.nextDouble();
        System.out.println("Enter second number: ");
        double b = scanner.nextDouble();
        System.out.println(a + " % " + b + " = " + (a % b));
    }

    public static void calcAreaAndPerimeter(Scanner scanner) {
        System.out.println("Enter first number: ");
        double a = scanner.nextDouble();
        System.out.println("Enter second number: ");
        double b = scanner.nextDouble();
        System.out.println("The area is " + a * b);
        System.out.println("The Perimeter is "  + 2*(a + b));
    }

}