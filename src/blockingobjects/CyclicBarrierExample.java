package blockingobjects;

import java.util.concurrent.CyclicBarrier;

/**
 * It is inverse of Semaphore.
 * In semaphore a certain no of threads can acquire the lock and work, but here task will be executed only if a certain
 * no. of threads are satisfied.
 *
 * Cyclic barrier -> 3
 * t1 and t2 will be blocked until a new thread t3 comes.
 * So, we can consider this as batching of thread only if we have a certain no of threads available to work.
 *
 * t1, t2, t3 -> will be unblocked to execute.
 * Now t4, and t5 will be blocked until t6 comes.
 *
 * So, to avoid deadlock we must have the available threads >= cyclic barrier parties
 */
public class CyclicBarrierExample {
}
