import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to calculator program!");

        while (true){
            System.out.println("Press any button to start,");
            System.out.println("Exit to program enter x:");
            char exit = scanner.nextLine().charAt(0);

            if (exit == 'x') {
                System.out.println("End of program.");
                return;
            }else {
                double first, second, result = 0;
                char operand;

                System.out.println("Enter first digit:");
                first = scanner.nextDouble();

                System.out.println("Enter second digit:");
                second = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("Enter operand to calculate:");
                operand = scanner.nextLine().charAt(0);

                switch (operand) {
                    case '+' :
                        result = first + second;
                        System.out.println(first + " " + operand + " " + " " + second + " = " + result);
                        break;
                    case '-' :
                        result = first - second;
                        System.out.println(first + " " + operand + " " + " " + second + " = " + result);
                        break;
                    case '*' :
                        result = first * second;
                        System.out.println(first + " " + operand + " " + " " + second + " = " + result);
                        break;
                    case '/' :
                        if (second != 0){
                            result = first / second;
                            System.out.println(first + " " + operand + " " + " " + second + " = " + result);
                        }else {
                            System.out.println("Cannot divide by zero");
                        }
                        break;
                    default:
                        System.out.println("Enter a valid operand:");
                }
            }
        }

    }
}