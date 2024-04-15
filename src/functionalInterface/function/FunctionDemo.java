package functionalInterface.function;

import java.util.function.Function;

/**
 * Function<T, R>
 *     T : Is the type for the parameter
 *     R : is the return type
 */
public class FunctionDemo {
    public static void main(String[] args) {
        Function<String, Integer> lengthCalc = str -> str.length();
        System.out.println(lengthCalc.apply("Harshit"));
    }
}
