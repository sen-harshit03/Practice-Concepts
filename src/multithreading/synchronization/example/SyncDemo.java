package multithreading.synchronization.example;

/**
 * Synchronized: Used with methods, blocks
 * Only one thread can execute that block/method at a time.
 - Multiple threads acting on same object can cause data inconsistency problem i.e Race condition
 - One thread at a time can increase the thread waiting time thus decreases the performance

 - Every object has unique lock
 - Thread acquires the lock completes its execution, then releases the lock.

 - Java also has class level lock
 - Applicable for static-synchronized methods.
 - To execute static synchronized methods, thread has to acquire the class-level lock.

 - There is no link between class-level lock and object level lock
 - Every object has a unique lock. But a thread can acquire the locks of multiple objects at a time.
 */
public class SyncDemo {
    public static void main(String[] args) {

        Display display1 = new Display();
        MyThread thread1 = new MyThread(display1, "Harshit");
        MyThread thread2 = new MyThread(display1, "Akash");

        thread1.start();
        thread2.start();

    }
}
