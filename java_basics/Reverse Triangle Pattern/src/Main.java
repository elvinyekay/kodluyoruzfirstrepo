import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many rows should the triangle have?: ");
        int row = sc.nextInt();

        if (row <=0){
            System.out.println("Row should be greater than 0");
            return;
        }

        for (int i = row; i > 0; i--) {
            for (int j = 0; j < (i * 2) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}