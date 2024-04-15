package functionalInterface.consumer;

import java.util.function.Consumer;

/**
 * Consumer <T>
 *     T: parameter type
 *
 * Consumer consumes the value of type T.
 * method: accept(T t)
 *
 */
public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> printMess = message -> System.out.println(message);
        printMess.accept("Oni chan");
    }
}
