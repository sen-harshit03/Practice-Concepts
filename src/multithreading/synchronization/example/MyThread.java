package multithreading.synchronization.example;

public class MyThread extends Thread {
    private Display display;
    private String name;

    MyThread(Display display, String name) {
        this.display = display;
        this.name = name;
    }

    public void run() {
        for(int i = 0; i<10; i++) {
            System.out.print("Hey ");
            try{
                display.wish(name);
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted: " + name);
            }
        }
    }

}
