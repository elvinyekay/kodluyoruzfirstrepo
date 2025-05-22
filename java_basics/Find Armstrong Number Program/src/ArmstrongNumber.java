import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num, tempNumber, digitCount = 0, tempDigit, total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        num = sc.nextInt();
        tempNumber = num;

        while (num != 0) {
            digitCount++;
            num /= 10;
        }
        num = tempNumber;
        for (int i = 1; i <= digitCount; i++) {
            tempDigit = tempNumber % 10;
            tempNumber = tempNumber / 10;
            total += (int) Math.pow(tempDigit, digitCount);
        }

        if (total == num) {
            System.out.println(num + " is a armstrong number.");
        } else {
            System.out.println(num + " is not a armstrong number.");
        }

    }
}
