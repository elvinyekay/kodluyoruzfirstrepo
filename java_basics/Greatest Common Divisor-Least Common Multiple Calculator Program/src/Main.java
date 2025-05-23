import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int first, second, gcd = 0, smallest, i=1, lcm = 0, LCM;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        first = sc.nextInt();

        System.out.println("Enter the second number: ");
        second = sc.nextInt();

        smallest = Math.max(first, second);

        //lcm
        while (i <= (first * second)) {
            if (i %first == 0 && i %second == 0) {
                lcm = i;
                break;
            }
            i++;
        }

        System.out.println("Lcm of " + first + " and " + second + " is " + lcm);

        //gcd
        i = smallest;
        while (i >= 1) {
            if (first % i == 0 && second % i == 0) {
                gcd = i;
                break;
            }
            i--;
        }
        System.out.println("GCD of " + first + " and " + second + " is " + gcd);
        LCM = (first * second) / gcd;
        System.out.println(LCM == lcm);

    }
}