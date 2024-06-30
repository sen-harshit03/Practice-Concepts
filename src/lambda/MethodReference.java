package lambda;

import java.util.function.Function;

/**
 * When we write a lambda expression, the body of the lambda expression is compiled into private static method on the class
 * and that static method takes the argument of the lambda expression and call another method.
 *
 * So when we are using JIT compiled then it is already present so no performance difference.
 * (does increase the class size a little)
 *
 * The method reference directly calls the method which is intended to call, so no indirect static method needed.
 * So, method reference is tiny bit faster than regular lambda expression.
 */
public class MethodReference {
    public static void main(String[] args) {
        Function<String, Integer> fun1 = String::length;

        System.out.println(fun1.apply("Harshit"));

    }

}
