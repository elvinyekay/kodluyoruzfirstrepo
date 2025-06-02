import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = sc.nextInt();

        boolean result = isPrime(number, 2);
        if (result) {
            System.out.println("Prime Number");
        }else {
            System.out.println("Not Prime Number");
        }

    }

    public static boolean isPrime(int number, int i) {
        if (number <= 1) return false;
        if (i == number) return true;
        if (number % i == 0) return false;
        return isPrime(number, i + 1);
    }
}