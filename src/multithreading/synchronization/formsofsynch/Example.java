package multithreading.synchronization.formsofsynch;

public class Example {

    public void m1() {
        synchronized (this) {
            System.out.println("m1");
        }
    }

    /**
     * In this case the monitor will be always 'this'.
     */
    public synchronized void m2() {
        System.out.println("m2");
    }


    public static void m3() {
        synchronized (Example.class) {  //  this object created by java during classloading as a blueprint.

        }
    }

    /**
     * In this case the monitor is the object created by class loader as a blueprint or prototype in the permGen
     * PermGen contains metadata required by the JVM to describe the classes and methods used in the application.
     * PermGen has been replaced by Metaspace post Java 8
     */

    public static synchronized void m4() {

    }
}
