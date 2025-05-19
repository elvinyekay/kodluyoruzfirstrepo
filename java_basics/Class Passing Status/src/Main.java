import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * Geçme Notu : 55
         *
         * Ödev
         * Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
         */
        Scanner scanner = new Scanner(System.in);
        int mathNote, physicNote, historyNote, azerbaijaniNote, musicNote;
        double averageNote;

        System.out.println("Enter the Mathematics Note");
        mathNote = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the Physic Note");
        physicNote = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the History Note");
        historyNote = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the Azerbaijani Note");
        azerbaijaniNote = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the Music Note");
        musicNote = scanner.nextInt();
        scanner.nextLine();
        if (mathNote > 0 && mathNote < 100 && physicNote > 0 && physicNote < 100 && historyNote > 0 && historyNote < 100 && azerbaijaniNote > 0 && azerbaijaniNote < 100 && musicNote > 0 && musicNote < 100) {
            averageNote = (mathNote + physicNote + historyNote + azerbaijaniNote + musicNote) / 5;
            if (averageNote >= 55) {
                System.out.println("You are passed the class");
            } else {
                System.out.println("You are not passed the class");
            }
            System.out.println("Average note is: " + averageNote);
        }


    }
}