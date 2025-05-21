import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0, sum = 0, number;

        System.out.println("Enter number: ");
        number = sc.nextInt();

        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 || i % 4 == 0) {
                sum += i;
                count++;
            }
        }

        System.out.println("The average of the numbers  is: " + sum / count);
    }
}