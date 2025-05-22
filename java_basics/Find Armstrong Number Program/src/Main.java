import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num, digitCount = 0, sumOfNumberDigits = 0, tempDigit, tempNumber;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        num = sc.nextInt();
        tempNumber = num;

        while (num != 0) {
            num /= 10;
            digitCount++;
        }

        for (int i = 1; i <= digitCount; i++) {
            tempDigit = tempNumber % 10;
            tempNumber /= 10;
            sumOfNumberDigits += tempDigit;
        }

        System.out.println("Sum of digits is : " + sumOfNumberDigits);


    }
}