import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the temperature:");
        double temperature = scanner.nextDouble();

        if (temperature <= 5){
            System.out.println("Go \"skiing\"");
        } else if (temperature > 5 && temperature <= 15) {
            System.out.println("Go to \"cinema\"");
        } else if (temperature > 15 && temperature <= 25) {
            System.out.println("Go to \"Picnic\"");
        } else if (temperature > 25) {
            System.out.println("Go to \"Swimming\"");
        }
    }
}