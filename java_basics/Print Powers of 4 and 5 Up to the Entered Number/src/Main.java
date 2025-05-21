import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        System.out.println("Powers of 4 Up to the Entered Number: ");
        for (int i = 1; i <= number; i *= 4){
            System.out.println(i);
        }

        System.out.println("==============================");
        System.out.println("Powers of 5 Up to the Entered Number: ");
        for (int i = 1; i <= number; i *= 5){
            System.out.println(i);
        }
    }
}