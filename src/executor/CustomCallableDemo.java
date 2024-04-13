package executor;

import java.util.concurrent.*;

public class CustomCallableDemo {
    public static void main(String[] args) {
        ExecutorService executorService = null;
        try {
            executorService = Executors.newFixedThreadPool(4);  // Pool is ready

            // Create a task
            Callable<Integer> summationCallable = new SummationCallable(3, 2);

            // throw the task
            Future<Integer> future = executorService.submit(summationCallable);


            try {
                int sum = future.get();
                System.out.println(sum);

            } catch (ExecutionException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        } finally {
            if(executorService != null) executorService.shutdown();
        }
    }
}
