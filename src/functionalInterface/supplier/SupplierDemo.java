package functionalInterface.supplier;

import java.util.Random;
import java.util.function.Supplier;

/**
 * Supplier <T>
 *     T: return type of method
 *
 *     method:  T get()
 *
 *     We don't have BiSupplier coz, we cannot return two different types from a method.
 *
 */
public class SupplierDemo {

    private static final int MIN_FACE_VALUE = 1;
    private static final int MAX_FACE_VALUE = 6;

    public static void main(String[] args) {
        Supplier<Integer> diceFaceValue1 = () -> new Random().nextInt(6) + 1;
        System.out.println(diceFaceValue1.get());

        Supplier<Integer> diceFaceValueCalc = () -> new Random().nextInt(MAX_FACE_VALUE - MIN_FACE_VALUE + 1) + MIN_FACE_VALUE;
        System.out.println(diceFaceValueCalc.get());
    }
}
