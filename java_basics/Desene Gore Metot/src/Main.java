import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın. Her çıkarma işlemi sırasında ekrana son değeri yazdırın. Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin. Yine her ekleme işleminde sayının son değerini ekrana yazdırın.
         * N Sayısı : 16
         * Çıktısı : 16 11 6 1 -4 1 6 11 16
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Reqem daxil edin: ");
        int number = sc.nextInt();
        printNumber(number);

    }

    public static void printNumber(int number) {
        System.out.print(number + " ");

        if (number <= 0) return;

        printNumber(number - 5);

        System.out.print(number + " ");

    }
}