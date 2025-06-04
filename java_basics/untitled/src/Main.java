import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] sortedArray = readAndSortArray();

        printArray(sortedArray);
    }

    public static int[] readAndSortArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length number:");
        int arrayLength = scanner.nextInt();
        int[] numbers = new int[arrayLength];

        System.out.println("Enter array elements: ");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println((i + 1) + ". element: ");
            numbers[i] = scanner.nextInt();
            insertInOrder(numbers, i);
        }
        return numbers;
    }

    public static void insertInOrder(int[] numbers, int currentIndex){
        while (currentIndex > 0 && (numbers[currentIndex] < numbers[currentIndex - 1])) {
            int tempValue = numbers[currentIndex];
            numbers[currentIndex] = numbers[currentIndex - 1];
            numbers[currentIndex - 1] = tempValue;
            currentIndex--;
        }
    }

    public static void printArray(int[] numbers) {
        System.out.print("[ ");
        for (int elem : numbers) {
            System.out.print(elem + ", ");
        }
        System.out.print("]");
    }
}