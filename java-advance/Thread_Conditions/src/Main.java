import java.util.ArrayList;
//import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    //    public static List<Integer> evenNumbers = Collections.synchronizedList(new ArrayList<>());
//    public static List<Integer> oddNumbers = Collections.synchronizedList(new ArrayList<>());
    public static final List<Integer> evenNumbers = new ArrayList<>();
    public static final List<Integer> oddNumbers = new ArrayList<>();

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10000; i++) {
            numbers.add(i);
        }

        List<Integer> part1 = numbers.subList(0, 2500);
        List<Integer> part2 = numbers.subList(2500, 5000);
        List<Integer> part3 = numbers.subList(5000, 7500);
        List<Integer> part4 = numbers.subList(7500, 10000);

        //version 1

//
//        Thread thread1 = new Thread(new Numbers(part1));
//        Thread thread2 = new Thread(new Numbers(part2));
//        Thread thread3 = new Thread(new Numbers(part3));
//        Thread thread4 = new Thread(new Numbers(part4));
//
//        thread1.start();
//        thread2.start();
//        thread3.start();
//        thread4.start();
//
//        try {
//            thread1.join();
//            thread2.join();
//            thread3.join();
//            thread4.join();
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }

        ExecutorService es = Executors.newFixedThreadPool(10);

        es.execute(new Numbers(part1));
        es.execute(new Numbers(part2));
        es.execute(new Numbers(part3));
        es.execute(new Numbers(part4));

        es.shutdown();
        while (!es.isTerminated()) {
            // Wait for all tasks to finish
        }

        System.out.println("Count of even numbers: " + evenNumbers.size());
        System.out.println("Count of odd numbers: " + oddNumbers.size());
    }
}