package multithreading.synchronization.producerConsumer;

import java.util.Random;

public class Producer extends Thread{

    public Producer(String name) {
        super(name);
    }


    public void run() {

        while(true) {
            synchronized (Driver.bucket) {
                if (Driver.bucket.size() < 100) {
                    Random random = new Random();
                    int num = random.nextInt(101);  // 0 to 100
                    Driver.bucket.add(num);
                    Driver.bucket.notifyAll();  // I have added the num, you can consume now
                    System.out.println(Thread.currentThread().getName() + " added " + num);
                } else {
                    try {
                        Driver.bucket.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
