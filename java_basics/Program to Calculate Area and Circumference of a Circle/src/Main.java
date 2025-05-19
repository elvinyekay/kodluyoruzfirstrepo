import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final double PI = 3.14;
        double radius,a, area, circumference, circleSegment;

        System.out.println("Enter a radius:");
        radius = scanner.nextDouble();
        System.out.println("Enter a size of the central angle:");
        a = scanner.nextDouble();

        area = PI * radius * radius;

        circumference = 2 * PI * radius;

        circleSegment = (PI * (radius * radius) * a) / 360;

        System.out.println("Circle area: " + area);
        System.out.println("Circle circumference: " + circumference);
        System.out.println("Circle Secment: " + circleSegment);
    }
}