package functionalInterface.unaryoperator;

import java.util.function.UnaryOperator;

/**
 * UnaryOperator <T>
 *     T: accepts T as a parameter.
 *
 *  Parameter type and return type is same.
 *
 *  Method : T apply(T t)
 */
public class UnaryOperatorDemo {
    public static void main(String[] args) {
        UnaryOperator<String> loweCaseConvertor = str -> str.toLowerCase();
        System.out.println(loweCaseConvertor.apply("MARCH"));

    }
}
