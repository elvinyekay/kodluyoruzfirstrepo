import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.

        Scanner scanner = new Scanner(System.in);

        double amount, vatAmount, totalAmount;
        int VATPercentage = 0;
        System.out.println("Enter the fee amount:");
        amount = scanner.nextDouble();
        if (amount > 0 && amount<= 1000){
            VATPercentage = 8;
        }if (amount > 1000){
            VATPercentage = 18;
        }
        vatAmount = (amount * VATPercentage)/100;
        totalAmount = amount + vatAmount;

        System.out.println("Amount without VAT: " + amount);
        System.out.println("VAT percentage: " + VATPercentage + "%");
        System.out.println("VAT Amount: " + vatAmount);
        System.out.println("Total Amount: " + totalAmount);

    }
}