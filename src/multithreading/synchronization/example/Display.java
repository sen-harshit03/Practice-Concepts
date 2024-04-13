package multithreading.synchronization.example;

public class Display {

    public synchronized void wish(String name) {
        System.out.println(name);
    }
}
