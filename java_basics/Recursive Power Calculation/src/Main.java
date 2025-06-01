import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Power Calculation");
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        System.out.println("Enter power: ");
        int p = sc.nextInt();

        int result = pow(n, p);
        System.out.println("The result of " + n + " raised to the power of " + p + " is " + result);
    }

    public static int pow(int a, int b) {
        if (b == 0) {
            return 1;
        }
        return a * pow(a, b - 1);
    }
}