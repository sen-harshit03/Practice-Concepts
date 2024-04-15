package functionalInterface.bifunction;

import java.util.function.BiFunction;

/**
 * BiFunction <T, U, R>
 *     T:  type of param1
 *     U: type of param2
 *     R: return type
 *
 *     Method: R apply(T t, U u)
 */
public class BiFunctionDemo {
    public static void main(String[] args) {
        BiFunction<Double, Double, Double> powerCalc = (num, base) -> Math.pow(num, base);
        System.out.println(powerCalc.apply(5.0, 2.0));
    }
}
