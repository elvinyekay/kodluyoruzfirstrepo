import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word to check is it palindrome?");
        String str = scanner.nextLine();
        System.out.println(isPalindromeII(str));
    }

    public static boolean isPalindrome(String str) {
        int index = 0;
        int lastIndex = str.length() - 1;

        while (index < lastIndex) {
            if (str.charAt(index) != str.charAt(lastIndex)) {
                return false;
            }
            index++;
            lastIndex--;
        }

        return true;
    }

    public static boolean isPalindromeII(String str) {
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        return str.equals(reverse);
    }
}