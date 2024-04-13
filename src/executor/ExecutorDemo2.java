package executor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *  execute method has void return type. So it can't return any value.
 *
 *  But if we want to get something (status or anything), then we should use "submit" method.
 *  It returns a contract "Future" which we can use to get information about the task.
 *
 *  Analogy:
 *  - We are at pizza shop, our task is to order pizza.
 *  - Then After paying (submit), we get back a token (in our case Future).
 *  - Using token (Future), we can get the info about the pizza state.
 *
 *  - future.get()
 *  The state could be ready or not ready.
 *
 *  Here we can only get the status of the task (so we are using Runnable interface)
 *
 *  If we want to do some task that returns some value. In that case we can't use Runnable interface, coz it only has
 *  one method run() whose return type is VOID.
 *
 *  So, such a scenarios we are provided with a contract, called "Callable"
 *
 *
 *
 */
public class ExecutorDemo2 {
    public static void main(String[] args) {
        ExecutorService executorService = null;

        try {
            executorService =
                    Executors.newFixedThreadPool(4);   // pool with size 4

            Runnable r = () -> System.out.println(":) ");

//            executorService.execute(r);      // VOID Return Type
            Future<?> future = executorService.submit(r);

            /**
             * Here we can do some other task while waiting for the task to complete
             */
            try {
                future.get();
            } catch (ExecutionException e) {  // pizza got burnt

            } catch (InterruptedException e) {

            }
        } finally {
            if(executorService != null)  executorService.shutdown();
        }
    }
}
