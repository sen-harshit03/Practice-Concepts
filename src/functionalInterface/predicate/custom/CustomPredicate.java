package functionalInterface.predicate.custom;

import java.util.Objects;
import java.util.function.Predicate;

@FunctionalInterface
public interface CustomPredicate<T> {

    boolean test(T t);

    default CustomPredicate<T> negate() {
        return  t -> !this.test(t);
    }

    default CustomPredicate<T> and(CustomPredicate<T> after) {
        Objects.requireNonNull(after);
        return (T t) -> this.test(t) && after.test(t);
    }

    default CustomPredicate<T> xOr(CustomPredicate<T> other) {
        Objects.requireNonNull(other);
        return t -> this.test(t) ^ other.test(t);
    }

    default CustomPredicate<T> or(CustomPredicate<T> other) {
        Objects.requireNonNull(other);

        return (T t) -> this.test(t) || other.test(t);
    }


}


class Demo {
    public static void main(String[] args) {

        CustomPredicate<String> predicate = String::isEmpty;

        CustomPredicate<String> negatePredicate = predicate.negate();

        System.out.println(negatePredicate.test(""));  // False
        System.out.println(negatePredicate.test("Hello"));  // True
    }
}
