package multithreading.synchronization.thisAsMonitor;



public class Resource {

    public void m1() {
        synchronized (this) {
            System.out.println("Method  m1");
        }
    }

    public void m2() {
        synchronized (this) {
            System.out.println("Method  m2");
        }
    }

}
