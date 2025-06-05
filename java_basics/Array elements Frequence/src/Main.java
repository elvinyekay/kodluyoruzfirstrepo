
public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] visited = {0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < numbers.length; i++) {
            if (!isVisited(visited, numbers[i])) {
                int frecuency = 0;
                for (int number : numbers) {
                    if (numbers[i] == number) {
                        frecuency++;
                    }
                }
                System.out.println(numbers[i] + " repeated " + frecuency + " times");
                visited[i] = numbers[i];
            }
        }
    }

    public static boolean isVisited(int[] visitedArr, int num) {
        for (int j : visitedArr) {
            if (j == num) return true;
        }
        return false;
    }
}