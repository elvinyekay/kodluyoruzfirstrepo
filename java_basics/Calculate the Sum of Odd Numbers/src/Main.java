import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum = 0, number;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter the number : ");
            number = sc.nextInt();
            if (number % 4 == 0) {
                sum += number;
            }
        }
        while (number % 2 == 0);
        System.out.println("The sum is : " + sum);
    }
}