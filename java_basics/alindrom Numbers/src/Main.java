import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = input.nextInt();

        if (isPalindrom(num)){
            System.out.println(num + " is palindrom");
        }else {
            System.out.println(num + " is not palindrom");
        }
    }


    public static boolean isPalindrom (int num) {
        int temp = num;
        int reverseNum = 0;
        int lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNum = reverseNum * 10 + lastNumber;
            temp = temp / 10;
        }

        System.out.println(reverseNum);

        return num == reverseNum;
    }
}