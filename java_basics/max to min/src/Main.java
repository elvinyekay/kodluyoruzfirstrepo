import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int first = input.nextInt();

        System.out.println("Enter the second number: ");
        int second = input.nextInt();

        System.out.println("Enter the third number: ");
        int third = input.nextInt();

        if ((first > second) && (first > third)) {
            if (second > third) {
                System.out.println("[ " + first + " " + second + " " + third + " ]");
            }else {
                System.out.println("[ " + first + " " + third + " " + second + " ]");
            }
        } else if ((second > first) && (second > third)) {
            if (first > third) {
                System.out.println("[ " + second + " " + first + " " + third + " ]");
            }else {
                System.out.println("[ " + second + " " + third + " " + first + " ]");
            }
        } else {
            if (first > second) {
                System.out.println("[ " + third + " " + first + " " + second + " ]");
            }else {
                System.out.println("[ " + third + " " + second + " " + first + " ]");
            }
        }
    }
}