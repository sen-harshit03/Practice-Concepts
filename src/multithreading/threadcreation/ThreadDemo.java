package multithreading.threadcreation;

/**
 * Creating
 * 1. Extending Thread class
 * 2. Implementing Runnable Interface
 */
public class ThreadDemo {
    public static void main(String[] args) {
        /**
         * Extending Thread class
         */
//        CustomThread1 customThread1 = new CustomThread1();
//        customThread1.start();
//        for(int i = 0; i<10; i++) {
//            System.out.println("Main" + i);
//        }

        /**
         * Implementing the Runnable Interface
         */

//        CustomRunnable runnable = new CustomRunnable();
//        // Runnable target is passed as an argument
//        Thread thread1 = new Thread(new CustomRunnable());
//        thread1.start();
//        for(int i = 0; i<10; i++) {
//            System.out.println("Main : " + i);
//        }

        /**
         * Using Lambda Expression
         */
        Runnable runnable1 = (() -> System.out.println("Custom Runnable"));
        Runnable runnable2 = (() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Custom Runnable");
            }
        });
        Thread thread2 = new Thread(runnable2);
        thread2.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main");
        }



        /**
         * Thread Naming
         */

//        System.out.println(Thread.currentThread().getName());
//        Thread.currentThread().setName("User main thread");
//        System.out.println(Thread.currentThread().getName());


        /**
         * Thread Priority
         * 1 - MIN_PRIORITY
         * 10 - MAX_PRIORITY
         * 5 - NORM_PRIORITY - BY default main method has priority of 5
         * Child thread inherit the priority from the parent
         */

//        Runnable runnable = (() -> {
//            for (int i = 0; i < 5; i++) {
//                System.out.println("Child thread");
//            }
//        });
//
//        Thread thread = new Thread(runnable);
//        thread.setPriority(10);  // Mandatory to set priority before starting the thread
//        thread.start();
//        System.out.println(thread.getPriority());
//        // Setting priority doesn't work in windows OS, but still we will get 10 as o/p for above line.
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Main thread");
//        }
    }
}
