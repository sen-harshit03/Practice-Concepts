package interfaceD.example3;

public interface Service1 {
    default void play() {
        System.out.println("Service2");
    }
}
