import java.util.List;

public class Numbers implements Runnable {
    private final List<Integer> part;

    public Numbers(List<Integer> part) {
        this.part = part;
    }

    @Override
    public void run() {
        for (Integer number : part) {
            if (number % 2 == 0) {
                synchronized (Main.evenNumbers) {
                    Main.evenNumbers.add(number);
                }
            } else {
                synchronized (Main.oddNumbers) {
                    Main.oddNumbers.add(number);
                }
            }
        }
    }
}
