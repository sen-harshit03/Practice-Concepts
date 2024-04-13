package executor;

import java.util.concurrent.*;

public class ExecutorWithCallable {
    public static void main(String[] args) {
        ExecutorService executorService = null;

        try {
            executorService = Executors.newFixedThreadPool(4);  // pool ready

            // Create a task
            Callable<String> c = () -> "Hello!";


            // Throw the task
            Future<String> future = executorService.submit(c);

            System.out.println("Doing other tasks");

            // Do anything while waiting

            try {
                String value = future.get();
                System.out.println(value);
            } catch (ExecutionException | InterruptedException e) {
                System.out.println(":(");
            }

        } finally {
            if(executorService != null) executorService.shutdown();
        }
    }
}
