import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip, şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
         */
        Scanner scanner = new Scanner(System.in);

        String loginFromDB = "patika";
        String passwordFromDB = "java123";

        System.out.println("Enter user login:");
        String login = scanner.nextLine();
        System.out.println("Enter user password:");
        String password = scanner.nextLine();

        if (login.equals(loginFromDB) && password.equals(passwordFromDB)){
            System.out.println("Welcome!. You are logged in.");
        }else{
            System.out.println("Wrong password or login. If you want to reset password and login enter 0.");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0){
                System.out.println("Enter new login:");
                String newLogin = scanner.nextLine();

                System.out.println("Enter new password:");
                String newPassword = scanner.nextLine();

                if (newLogin.equals(loginFromDB) && newPassword.equals(passwordFromDB)){
                    System.out.println("Cannot create a new password and login. Please try again.");
                }else {
                    System.out.println("Welcome!. You are logged in.");
                }
            }else{
                System.out.println("Restart the program to check new password");
            }
        }
    }
}