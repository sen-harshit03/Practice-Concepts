package functionalInterface.biconsumer;

import java.util.function.BiConsumer;

/**
 * BiConsumer <T, U>
 *     T: type of param 1
 *     U: type of param 2

 *     Accepts two parameters and returns void
 *
 *     Method : acc
 */
public class BiConsumerDemo {

    public static void main(String[] args) {
        BiConsumer<String, Integer> printDetails = (name, age) -> System.out.println("My name is " + name + " and my age is " + age);
        printDetails.accept("Harshit", 23);
    }

}
