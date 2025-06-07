public class Main {
    public static void main(String[] args) {

        System.out.println(isPalindromeII("abbas"));
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