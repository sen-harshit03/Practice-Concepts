package executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * newFixedThreadPool - Creates thread pool with fixed number of threads.
 * newSingleThreadExecutor - Creates thread pool with 1 thread.
 * newCachedThreadPool - Creates thread on-demand, if none of the threads are available to handle the new task then a
 *                       new thread will be created. (Idle thread will be terminated after 60 sec)
 * newWorkStealingPool - Every thread has a queue of tasks, if any thread is idle (queue is empty), it can "steal" the
 *                      "work" (task) from other threads queue to its queue.
 */
public class TypesOfExecutorService {
    public static void main(String[] args) {

        ExecutorService es1 = Executors.newFixedThreadPool(4);
        ExecutorService es2 = Executors.newSingleThreadExecutor(); // == newFixedThreadPool(1)
        ExecutorService es3 = Executors.newCachedThreadPool(); // It creates thread on demand, if all threads are busy
        // and we throw a new task to the pool, to handle that task a new thread will be created.
        // If thread remains idle for 60seconds then that thread is terminated, and removed from the pool.

        ExecutorService es4 = Executors.newWorkStealingPool();
    }
}
