package executor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class ScheduledExecutors {
    public static void main(String[] args) {

        ScheduledExecutorService es1 = Executors.newScheduledThreadPool(3); // Creates thread pool with 3 threads.
        ScheduledExecutorService es2 = Executors.newSingleThreadScheduledExecutor(); // Only one thread.
    }
}
