import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, r, nFact, rFact, nMinusRFact;
        double combinationResult;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter n to calculate factorial: ");
        n = scanner.nextInt();

        System.out.println("Enter r to calculate factorial: ");
        r = scanner.nextInt();

        if (r > n) {
            System.out.println("The r number can't be greater than the n");
        }else {
            nFact = factorial(n);
            System.out.println("Factorial of " + n + " is " + nFact);

            rFact = factorial(r);
            System.out.println("Factorial of " + r + " is " + rFact);

            nMinusRFact = factorial(n-r);
            System.out.println("Factorial of " + n + " - " + r + " is " + nMinusRFact);

            combinationResult = (double) nFact / (rFact * nMinusRFact);

            System.out.println("The combination result is: " + combinationResult);
        }
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}