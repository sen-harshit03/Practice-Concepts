package multithreading.synchronization.thisAsMonitor;

import multithreading.threadcreation.CustomRunnable;

/**
 * Both m1 and m2 methods may or may not be synchronized. It depends on the 'Monitor'.
 * If this for m1 and m2 are same then they are synchronized.
 * If this for m1 and m2 are not same then they are not synchronized.
 *
 * In the below example the threads are not synchronized, coz the monitor are different.
 */

public class Main {

    public static void main(String[] args) {

        Resource r1 = new Resource();
        Resource r2 = new Resource();

        Thread t1 = new Thread() {
            @Override
            public void run() {
                r1.m1();
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                r2.m2();
            }
        };
    }
}
