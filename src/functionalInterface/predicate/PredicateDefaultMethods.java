package functionalInterface.predicate;

import java.util.function.Predicate;

/**
 * Predicate has two default methods
 * 1. and -> takes a predicate and returns a predicate
 * 2. negate -> returns the new predicate by negating the current predicate.
 */
public class PredicateDefaultMethods {
    public static void main(String[] args) {
        Predicate<String> p1 = String::isEmpty;

        Predicate<String> notPredicate = p1.negate();

        System.out.println(notPredicate.test("")); // false
        System.out.println(notPredicate.test("not empty")); // true
    }
}
