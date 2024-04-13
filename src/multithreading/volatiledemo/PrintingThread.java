package multithreading.volatiledemo;

public class PrintingThread extends Thread {

    public void run() {
        try{
            while (true) {
                System.out.println(Driver.count);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
