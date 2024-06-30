package functionalInterface.consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Consumer has 1 default method
 * andThen -> takes a consumer<T> and returns another consumer<T>
 *     by chaining the first consumer with the second consumer.
 */
public class ConsumerAndThen {
    public static void main(String[] args) {
        Consumer<List<String>> c1 = (list) -> list.add("First");
        Consumer<List<String>> c2 = (list) -> list.add("Second");

        Consumer<List<String>> consumer = c1.andThen(c2);

        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c"));

        consumer.accept(list);

        System.out.println(list);

        // list -> a, b, c, first, second


    }
}
