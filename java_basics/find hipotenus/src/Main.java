import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first side: ");
        int a = scanner.nextInt();
        System.out.println("Enter second side: ");
        int b = scanner.nextInt();

        double c = Math.sqrt((Math.pow(a, 2) + Math.pow(b,2)));
        System.out.println("Hipotenus" + c);
    }
}