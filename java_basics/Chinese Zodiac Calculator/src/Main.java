import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year, calculateZodiacNumber;
        String zodiac = "";

        System.out.println("Enter the birth year:");
        year = sc.nextInt();
        calculateZodiacNumber = year % 12;
        if (year < 0 || year > 2025) {
            System.out.println("Invalid birth year");
        } else {
            switch (calculateZodiacNumber) {
                case 0 -> zodiac = "Monkey";
                case 1 -> zodiac = "Rooster";
                case 2 -> zodiac = "Dog";
                case 3 -> zodiac = "Pig";
                case 4 -> zodiac = "Rat";
                case 5 -> zodiac = "Ox";
                case 6 -> zodiac = "Tiger";
                case 7 -> zodiac = "Rabbit";
                case 8 -> zodiac = "Dragon";
                case 9 -> zodiac = "Snake";
                case 10 -> zodiac = "Horse";
                case 11 -> zodiac = "Goat";
            }
            System.out.println("Your Chinese Zodiac is : " + zodiac);
        }
    }
}