package executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *  Executor Service is the child class of the Executor Interface (functional interface) which have one method 'execute'
 *
 *  Using Executor Service, we can create thread pools in which we can have the predefined number of threads which will
 *  do certain (Runnable or Callable targets) tasks.
 *
 *  Real-life Analogy:
 *  Consider a real analogy of swimming pool in which we have different swimming lanes.
 *  Each lane will have one swimmer at a time.
 *
 *  You as a user will throw ball in the swimming pool.
 *  One of the swimmer will take the ball to the other end.
 *
 *  Relating this analogy with executor service.
 *
 *  Swimming pool: Thread Pool/ executorService
 *  Swimming lanes: No of CPU cores
 *  Swimmers: No of threads in the thread pool
 *  Ball: Task which swimmers have to do.
 *
 *
 *  Since Executor service doesn't implement the AutoClosable Interface, we have to manually do the shutdown operation.
 *  And also we can't use try-with-resources.
 *
 *  There are two methods provided by the Executor Service for shutdown.
 *  shutDown() : void -> When used it waits for all the tasks in the pool to complete, then shutdown the service.
 *  shutDownNow() : List of Runnable -> It shutdowns the service immediately, doesn't wait for the task to complete.
 *
 */
public class ExecutorDemo {


    public static void main(String[] args) {

        ExecutorService executorService = null;
        try {
            int threads = Runtime.getRuntime().availableProcessors();
            System.out.println(threads);  // 8 coz Ryzen 3550H has 8 threads

            executorService = Executors.newFixedThreadPool(threads);  // Pool with 8 lanes created

            Runnable task1 = () -> System.out.println("Task1 " + Thread.currentThread().getName()); // Task
            executorService.execute(task1);

            System.out.println("Main task " + Thread.currentThread().getName());
        } finally {
            if(executorService != null) executorService.shutdown();
        }



    }
}
