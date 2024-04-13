package multithreading.threadcreation;

public class CustomThread1 extends Thread {

    @Override
    public void run() {
        for(int i = 0; i<10; i++) {
            System.out.println("Custom" + i);
        }
    }
}
