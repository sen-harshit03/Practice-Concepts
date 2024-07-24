package functionalInterface.consumer.custom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * When we write the lambda expression, the body of the lambda is compiled down to a private static method on a class.
 * And that static method takes the argument and call the another desired method.
 *
 * lambda expression -> private static method -> actual method
 * Method reference -> actual method
 */
public class Demo {
    public static void main(String[] args) {

        CustomConsumer<String> consumer = (String t) -> System.out.println(t.length());

        consumer.accept("Hello");

        CustomConsumer<List<String>> c1 = list -> list.add("First");
        CustomConsumer<List<String>> c2 = list -> list.add("Second");

        CustomConsumer<List<String>> c3 = c1.andThen(c2);

        List<String> strings = new ArrayList<>(Arrays.asList("String1", "String2", "String3"));
        c3.accept(strings);

        System.out.println(strings);

    }
}
