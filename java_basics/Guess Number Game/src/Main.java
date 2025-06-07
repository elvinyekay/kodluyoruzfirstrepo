import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int right = 0, input;
        boolean isWin = false;
        int[] wrong = new int[5];
        boolean mistake = false;

        while (right < 5) {
            int random = rand.nextInt(100);
            System.out.println(random);
            System.out.println("Enter your guess number: (0 - 100)");
            input = scanner.nextInt();

            if (input < 0 || input > 90) {
                System.out.println("Please enter number between 0 - 100");
                if (mistake){
                    System.out.println("Too many wrong inputs, your right: " + (5- (++right)));
                }else{
                    mistake = true;
                    System.out.println("Writing wrong number is take 1 life");
                }
                continue;
            }

            if (input == random) {
                System.out.println("Your number: " + input);
                System.out.println("Guess number: " + random);
                System.out.println("Congratulations. You guess the number.");
                isWin = true;
                break;
            } else {
                System.out.println("Your number: " + input);
                System.out.println("Guess number: " + random);
                System.out.println("Sorry, not a right number, try again.");
                if (input > random){
                    System.out.println("The select Number greater than guess number.");
                }else{
                    System.out.println("The select Number smaller than guess number.");
                }
            }
            wrong[right++] = input;
            System.out.println((5 - right) + " right.");
        }
        if (!isWin){
            System.out.println("You loose");
            System.out.println("Your guess: " + Arrays.toString(wrong));
        }
    }
}