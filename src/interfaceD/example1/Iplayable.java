package interfaceD.example1;

import java.util.List;

public interface Iplayable {
    public final String model = "Casio xxx";  // public static final


    void play();  // public abstract

    default void method1() {        // public
        System.out.println("method1");
    }



    // Serves as util method
    public static void method2() {       // public - by default but we can also make it private.
        System.out.println("method2");
    }

}
