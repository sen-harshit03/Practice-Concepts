package multithreading.volatiledemo;

public class IncrementalThread extends Thread {

    public void run() {
        try{
            while (true) {
                Driver.count++;
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
