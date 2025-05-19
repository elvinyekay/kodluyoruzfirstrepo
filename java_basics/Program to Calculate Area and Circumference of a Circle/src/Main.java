import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.
         *
         * Alan Formülü : π * r * r;
         *
         * Çevre Formülü : 2 * π * r;
         *
         * Ödev
         * Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
         *
         * 𝜋 sayısını = 3.14 alınız.
         *
         * Formül : (𝜋 * (r*r) * 𝛼) / 360
         */

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