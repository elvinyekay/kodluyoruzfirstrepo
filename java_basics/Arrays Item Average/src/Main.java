public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        double result = harmonicAverage(arr);
        System.out.println(result);
    }

    public static double harmonicAverage(int[] arr) {
        if(arr == null || arr.length == 0){
            System.out.println("Array is null or empty");
        }
        double sum = 0;
        for (int i: arr) {
            sum += (double) 1 / arr[i];
        }
        return arr.length / sum;
    }
}