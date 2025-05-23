import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int min, max, number;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter : ");
        number = sc.nextInt();

        System.out.println(1 + ".)Enter number : ");
        int num = sc.nextInt();

        min = num;
        max = num;

        for (int i = 2; i <= number; i++) {
            System.out.println(i + ".)Enter number : ");
            num = sc.nextInt();
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Minimum number is : " + min);
        System.out.println("Maximum number is : " + max);

    }

}