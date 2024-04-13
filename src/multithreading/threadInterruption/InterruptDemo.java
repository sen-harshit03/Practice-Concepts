package multithreading.threadInterruption;

import java.util.concurrent.ConcurrentHashMap;

public class InterruptDemo {

    public static void main(String[] args) {

        // Create a thread and define a job
        Runnable runnable = (() -> {
            try {
                for (int i = 0; i<10; i++) {
                    System.out.println("Lazy Thread..." + i);
                    Thread.sleep(1);
                }
            } catch (InterruptedException e) {
                System.out.println("Interrupt occurred");
            }
        });


        Thread thread =  new Thread(runnable);
        thread.start();
        thread.interrupt();
        System.out.println("Main Method...siuuu");

    }
}
