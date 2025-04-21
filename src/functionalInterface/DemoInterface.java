package functionalInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@FunctionalInterface
public interface DemoInterface {

    public abstract boolean test(int num);

    default void testDefault() {
        System.out.println("Default method");
    }

    public static void staticMe() {
        System.out.println("Static method");
    }

}


class DemoImpl implements DemoInterface {

    @Override
    public boolean test(final int num) {
        return num % 2 == 0;
    }
}

class Driver {

    public static void main(String[] args) {

        DemoInterface impl = new DemoImpl();
        impl.test(2);

        /**
         * Anonymous classes
         */
        DemoInterface evenChecker = new DemoInterface() {
            @Override
            public boolean test(final int num) {
                return num % 2 == 0;
            }
        };

        DemoInterface oddChecker = new DemoInterface() {
            @Override
            public boolean test(final int num) {
                return num % 2 != 0;
            }
        };


        /**
         * lambdas expression
         * (params) -> expression;
         */
        DemoInterface evenCheck = num -> num % 2 == 0;
        DemoInterface oddCheck = num -> num % 2 != 0;

        boolean isEven = evenCheck.test(2);
//        System.out.println(isEven);


        Predicate<Integer> oddChec = (num) -> num % 2 != 0;
        Consumer<Integer> consumer = (num) -> System.out.println(num);
        Supplier<Integer> supplier = () -> 2;

        BiPredicate<Integer, Integer> isEvenn = (num1, num2) -> num1 + num2 % 2 == 0;


        Function<Integer, Integer> fun = (num) -> num + 2;
        UnaryOperator<Integer> uni = (num) -> num * 2;
        BinaryOperator<Integer> bin = (num1, num2) -> num1 + num2;



        /**
         * Predicate -> test -> T type,  return boolean
         * Consumer -> accept -> T type, void
         * Supplier -> get ->     return T
         * Function -> apply -> T type, return R
         *
         * BiPredicate -> (T, R) -> boolean
         * BiConsumer -> (T, R) -> void
         * BiSupplier -> Does not exist
         * BiFunction -> (T,R) -> U
         *
         * UnaryOperator -> T type
         * BinaryOperator -> (T,T) -> T
         *
         * Runnable
         * Callable
         *
         *
         */

//        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7);
//        integers.forEach((num) -> System.out.println(num));
//        integers.forEach(System.out::println);

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        Collections.reverse(integers);
        System.out.println(integers);

//        List<Integer> parsedNumbers = integers.stream()
//                .filter(num -> {
//                    System.out.println("Filtering num " + num);
//                    return num % 2 == 0;
//                })
//                .map(num -> {
//                    System.out.println("Mapping num " + num);
//                    return num * 2;
//                })
//                .sorted()
//                .collect(Collectors.toList());

        /**
         * Filtering 1
         * Filtering 2
         * Mapping 2
         * Filtering 3
         * Filtering 4
         * Mapping 4
         *
         */

        String name = getName(2).orElseThrow(() -> new RuntimeException("Name not found"));


    }

    public static Optional<String> getName(int id) {
        if (id == 1) {
            return Optional.ofNullable(null);
        }


        return Optional.empty();
    }

}
