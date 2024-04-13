package multithreading.synchronization.deadlock;

/**
 * Deadlock occurs when two or more thread waiting for the lock for the monitor, which is already acquired some thread.
 *
 * T1 -> can only release the lock of 'a' when it will reach end of that block, but to reach the end of that block it
 *  further requires the lock of the 'b',  which is already acquired by the T2 and T2 will only release the lock if it
 *  reaches the end of the block. but for T2 to reach end of the block it has to acquire the lock for the 'a' which is
 *  already acquired by the T1.
 *
 *
 *  It can be inspected using Profiler.
 */
public class Example {

    final Object a = new Object();
    final Object b = new Object();

    public void m1() {
        // T1 and T3
        synchronized (a) {
            // T1 acquired the lock for the monitor 'a'. Now T1 wants to acquire the lock for the monitor 'b' which is already
            // acquired by T2.
            synchronized (b) {

            }
        }
    }


    public void m2() {
        // T2 and T4
        synchronized (b) {
            // T2 acquired the lock for the monitor 'b'. Now T2 wants to acquire the lock for the monitor 'a' which is already
            // acquired by T1
            synchronized (a) {

            }
        }
    }

}
