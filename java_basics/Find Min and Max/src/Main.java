import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {15, 12, 788, 1, -1, -778, 2, 0};

        System.out.println("Enter a number: ");
        int input = new Scanner(System.in).nextInt();
        Integer min = null, max = null;

        for (int j : arr) {
            if (j < input) {
                if (min == null || j > min) {
                    min = j;
                }
            }else if (j > input) {
                if (max == null || j < max) {
                    max = j;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Min value : " + min);
        System.out.println("Max value : " + max);
    }
}