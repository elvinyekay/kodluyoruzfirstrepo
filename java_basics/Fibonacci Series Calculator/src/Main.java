import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp1 = 0, second = 1, next;

        System.out.println("Enter Fibonacci Series N number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Enter positive number");
            return;
        }

        System.out.print(temp1 + " " + second + " ");
        for (int i = 2; i < n; i++) {
            next = temp1 + second;
            temp1 = second;
            second = next;
            System.out.print(next + " ");
        }
    }
}