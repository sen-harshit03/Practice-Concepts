package functionalInterface.predicate;

import java.util.function.Predicate;

/**
 * Java 8
 * Interface: Abstraction, default and static method
 * FunctionalInterface: SAM - Single Abstract Method,
 */

/**
 * Takes the generic type for the Parameter, and returns the boolean
 * Method name: test(T t)
 */
public class PredicateDemo {


    public static void main(String[] args) {
        Predicate<Integer> oddFilter = n -> n % 2 != 0;
        Predicate<Integer> primeFilter = (num) -> {
            if(num <= 1) return false;
            for (int i = 2; i < Math.sqrt(num); i++) {
                if (num % i == 0) return false;
            }
            return true;
        };

        boolean isOddAndPrime = oddFilter.and(primeFilter).test(8);
        System.out.println(isOddAndPrime);
    }


}
