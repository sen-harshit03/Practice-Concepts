package exceptionHandling.example1;

import java.util.Deque;
import java.util.Queue;

public class Example2 {
    public static void main(String[] args) {
        System.out.println(m1());

    }

    private static int m1() {
        try {
            return 10;
        } finally {
            return 20;
        }
    }

    private static int m2() {
        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            System.out.println(":(");
        } finally {
            return 99;
        }
    }
}
