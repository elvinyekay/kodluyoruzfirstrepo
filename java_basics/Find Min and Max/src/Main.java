import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {15, 12, 788, 1, -1, -778, 2, 0};

        System.out.println("Enter a number: ");
        int input = new Scanner(System.in).nextInt();
        Integer closestMin = null, closestMax = null;

        for (int j : arr) {
            if (j < input) {
                if (closestMin == null || j > closestMin) {
                    closestMin = j;
                }
            }else if (j > input) {
                if (closestMax == null || j < closestMax) {
                    closestMax = j;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Closest smaller number than the entered number: " + closestMin);
        System.out.println("Closest larger number than the entered number: " + closestMax);
    }
}