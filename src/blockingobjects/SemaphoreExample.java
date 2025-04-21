package blockingobjects;

import java.util.concurrent.Semaphore;

/**
 * Blocking objects "blocks" the thread from execution.
 * When we use synchronized, we limit object with one thread only. So threads executing multiple code blocks
 * completely independent of each other needs to wait to acquire monitor lock. eg. Reading thread waiting for writing thread
 * to release the lock.
 *
 *
 * But what if we want a certain no of threads to execute (like making 10 concurrent request to 3rd party API)
 * In this case, we can use Semaphore to limit the no of threads executing the code block.
 *
 * In the given example, only 3 threads can acquire the lock and work, rest threads will be blocked until any thread releases the lock.
 *
 * There are two types of Semaphore
 * 1. Fair Semaphore: the next thread getting the lock will be in order.
 * 2. Unfair Semaphore: the next will be picked JVM randomly.
 *
 * Thread acquires the lock and enters the code execution block and decreases the permit by 1. So, when permits becomes 0
 * then no new thread can acquire the lock, and thread increment the permit by 1 once it releases the lock.
 *
 * In case of recursive function, where A acquired the lock and calls the same function but if the permit at that time is 0
 * then A CANNOT enter the code execution block.
 * This is not the case with ReentrantReadWriteLock, so that's why we call it as 'Re' EnterantLock
 */
public class SemaphoreExample {

    Semaphore semaphore = new Semaphore(3, true);  // permits only 3 threads to execute the block b;w acquire and release.



    public void read() {
        // t1, t2, t3, t4, t5  (t4 and t5 have to wait), once any thread releases the lock, the next thread can acquire it.
        try {
            semaphore.acquire();  // t1, t2, t3


        } catch (InterruptedException e) {

        } finally {
            semaphore.release();
        }
    }
}
