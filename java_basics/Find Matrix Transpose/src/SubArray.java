public class SubArray {
    public static void main(String[] args) {
        int[] A = {1, -2, 4, -5, 1};
        int n = A.length, sum = 0, count = 0;

        for (int length = 1; length <= n; length++) {
            for (int start = 0; start <= n - length; start++) {
                for (int i = start; i < start + length; i++) {
                    sum += A[i];
                }
                if (sum < 0) {
                    count++;
                }
                sum = 0;
            }
        }
        System.out.println("Count: " + count);

        System.out.println("Print subArrays ");
        printSubArrays(n, A);
    }

    public static void printSubArrays(int n, int[] A) {
        for (int length = 1; length <= n; length++) {
            for (int start = 0; start < n - length; start++) {
                System.out.print("[");
                for (int i = start; i < start + length; i++) {
                    System.out.print(A[i]);
                    if (i < start + length - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println("]");
            }
        }
    }
}
