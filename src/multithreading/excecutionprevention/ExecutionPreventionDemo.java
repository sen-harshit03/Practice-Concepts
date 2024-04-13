package multithreading.excecutionprevention;

/**
 * Thread Execution can be prevented by three ways:
 * 1. Thread.yield() -> static, native method
 * 2. thread1.join() -> non-static, final (can't override)  throws InterruptedException
 * 3. Thread.sleep() -> static, native(with one param)  throws Interrupted Exception
 */
public class ExecutionPreventionDemo {

    /**
     * Thread.Yield -> thread pauses its execution and goes to waiting state. so that other thread of same or higher
     * priority can start/continue its execution.
     */


    /**
     * paymentThread.join() , paymentThread.join(long ms), paymentThread.join(long ms, int ns)
     * Current thread (orderThread) pauses its execution and waits for the paymentThread to complete its execution.
     *
     * Join method can cause deadlocks situations.
     * 1. paymentThread.join() and orderThread.join() -> Both threads are waiting for each other to complete its execution.
     * 2. OrderThread -> orderThread.join()
     */


    /**
     * Thread.sleep(long ms), Thread.sleep(long ms, int ns)
     * Current thread pauses its execution for some time.
     */

    public static void main(String[] args) {

    }



}
