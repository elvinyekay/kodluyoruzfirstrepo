import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mathNote, physicNote,chemistryNote, azNote, historyNote, musicNote;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the mathematics note:");
        mathNote = scanner.nextByte();

        System.out.println("Enter the physic note:");
        physicNote = scanner.nextByte();

        System.out.println("Enter the chemistry note:");
        chemistryNote = scanner.nextByte();

        System.out.println("Enter the Azerbaijani language note:");
        azNote = scanner.nextByte();

        System.out.println("Enter the history note:");
        historyNote = scanner.nextByte();

        System.out.println("Enter the music note:");
        musicNote = scanner.nextByte();

        double averageNote = (double) (mathNote + physicNote + chemistryNote + azNote + historyNote + musicNote) /6;

        System.out.println("Average note is : " + averageNote);

        System.out.println(averageNote > 60 ? "Passed the Class" : "Failed the Class" );

    }
}