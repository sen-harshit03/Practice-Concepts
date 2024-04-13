package multithreading.synchronization.producerConsumer;

public class Consumer extends Thread {

    public Consumer(String name) {
        super(name);
    }

    public void run() {
        // C1 and C2
        while (true) {   // C1   // C2

            synchronized (Driver.bucket) {     //  synchronized(Object) -> object is called monitor
                if (!Driver.bucket.isEmpty()) {  // C1 [10]  -> C1 goes to runnable and C2 goes to running C2[10]
                    int num = Driver.bucket.get(0);
                    Driver.bucket.remove(0);
                    Driver.bucket.notifyAll();  // I have consumed the num, you can now add more numbers
                    System.out.println(Thread.currentThread().getName() + " consumed " + num);  // C2 consumed 10
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


/**
 *      c2 c1 -> {shared resource} <- p1 p2
 *
 *      When you use 'this' as monitor then monitor is basically an instance of Consumer class or Producer.
 *      Since we can have as many consumer as well as producer, which means we are basically having monitor for each thread.
 *      and having monitor corresponding to each thread will not solve this issue.
 *      The code piece is not synchronized at all.
 *
 *      Think Monitor as police man at traffic.
 *      There is only one police who is managing who gets the to access shared resource (road)
 *
 *      So in our case having 'this' as a monitor will be equivalent to having police for each car(thread).
 *
 *      The best object in this case could be the shared resource itself (bucket)
 *
 *
 *      Just adding Driver.bucket as MONITOR we solved the issue of race condition. At the same time we have two pieces of code
 *      present at two different locations synchonized with each other.
 *
 *      And at a time only one thread can acquire the lock of the monitor and start executing.
 *      It could be either p1, p2, c1 or c2.
 *
 *
 *
 *
 *
 *
 */
