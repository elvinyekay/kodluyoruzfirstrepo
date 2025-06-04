public class Main {
    public static void main(String[] args) {

        int[] arr = {3, 7, 3, 4, 3, 2, 9, 4, 10, 2, 21, 10, 1, 33, 9, 1};
        int[] duplicate = new int[arr.length];
        int startIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    if ((arr[i] % 2 == 0) && !isHas(duplicate, arr[i])) {
                        duplicate[startIndex++] = arr[i];
                    }
                    break;
                }
            }
        }
        printArray(duplicate);
    }

    public static boolean isHas(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void printArray(int[] arr) {
        System.out.print("[ ");
        for (int value : arr) {
            if (value != 0) {
                System.out.print(value + ", ");
            }
        }
        System.out.print("]");
    }
}
