import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        int right = 3, balance = 1500, choice;
        Scanner input = new Scanner(System.in);

        while (right > 0) {
            System.out.print("Enter your username: ");
            userName = input.nextLine();

            System.out.print("Enter your password: ");
            password = input.nextLine();
            if (userName.equals("patika") && password.equals("dev123")) {

                System.out.println("Welcome to MyBank ATM");

                do {
                    System.out.println("1. Deposit money");
                    System.out.println("2. Withdraw money");
                    System.out.println("3. Show balance");
                    System.out.println("4. Exit");
                    System.out.println("Choose your option: ");

                    choice = input.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.print("Enter amount to deposit: ");
                            int deposit = input.nextInt();
                            balance += deposit;
                            System.out.println("Your balance is: " + balance);
                            break;
                        case 2:
                            System.out.println("Enter amount to withdraw: ");
                            int withdraw = input.nextInt();
                            if (balance >= withdraw) {
                                balance -= withdraw;
                                System.out.println("Your balance is: " + balance);
                            } else {
                                System.out.println("Your balance is less than the current withdraw amount, balance is " + balance);
                            }
                            break;
                        case 3:
                            System.out.println("Your balance is: " + balance);
                            break;
                        case 4:
                            System.out.println("Goodbye!");
                            return;
                        default:
                            System.out.println("Invalid choice");
                    }
                } while (true);
            } else {
                right--;
                System.out.println("Wrong username or password");
                if (right != 0) {
                    System.out.println("Try again. You have " + right + " attempt(s) left.");
                } else {
                    System.out.println("Contact to the bank");
                    return;
                }
            }
        }
    }
}