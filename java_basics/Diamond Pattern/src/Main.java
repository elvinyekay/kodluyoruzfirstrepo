import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of side rows : ");
        int num = sc.nextInt();

        //upside
        for (int i = 1; i < num; i++) {
            printPatternLine(num, i);
        }
        //downside
        for (int i = num; i >= 1; i--) {
            printPatternLine(num, i);
        }
    }

    private static void printPatternLine(int num, int i) {
        for (int k = 1; k <= num-i; k++) {
            System.out.print(" ");
        }
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}