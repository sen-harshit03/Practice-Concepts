package multithreading.volatiledemo;

/**
 *  Here we have 2 threads
 *  IncrementalThread: Incrementing the value of count.
 *  Printing Thread: Printing the value of count.
 *
 *  Let say the while loop in the Incrementing Thread ran for 10 times, which means count = 10.
 *
 *  But printing thread tried to print the count it only prints the 0 or any other value less than or equal to 10.
 *
 *  WHY is this behaviour
 *
 *  Actually the IncrementalThread might be running in some other CPU core, whereas PrintingThread might be running on
 *  some different CPU core.
 *
 *  So when IncrementalThread is incrementing the value of count, it is actually increasing the value present inside its buffer
 *  Which means the changes made by the incrementing thread might not fet mitigated to the MAIN MEMORY.
 *
 *  count = 0 (MAIN MEMORY)
 *  count = 10 (BUFFER MEMORY OF CPU in which incremental thread is running)
 *
 *  So the printing thread read the value of count from the main memory and printed it which is 0.
 *
 *  To Solve this issue, we have a keyword => VOLATILE
 *
 *  Make the shared resource volatile, so that any change in that resource made by thread, the same change will be mitigated
 *  to the MAIN MEMORY.
 *
 *
 *
 *
 */
public class Driver {
//    public static int count = 0;  -> prev
    public static volatile int count = 0;

    public static void main(String[] args) {

        IncrementalThread it1 = new IncrementalThread();
        PrintingThread pt1 = new PrintingThread();

        it1.start();
        pt1.start();
    }
}
