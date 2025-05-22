import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of side rows : ");
        int num = sc.nextInt();

        //upside
        for (int i = 0; i < num; i++) {
            printPatternLine(num, i);
        }
        //downside
        for (int i = num; i >= 0; i--) {
            printPatternLine(num, i);
        }
    }

    private static void printPatternLine(int num, int i) {
        for (int k = 0; k < num-i; k++) {
            System.out.print(" ");
        }
        for (int j = 1; j <= (2 * i + 1); j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}