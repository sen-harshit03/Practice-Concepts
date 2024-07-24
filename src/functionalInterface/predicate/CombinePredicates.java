package functionalInterface.predicate;

import java.util.List;
import java.util.function.Predicate;

public class CombinePredicates {
    public static void main(String[] args) {

    }


    private static Predicate<Product> combine(List<Predicate<Product>> predicates) {
        Predicate<Product> test = product -> true;
        for (Predicate pred : predicates) {
            test.and(pred);
        }
        return test;

        // using streams

//        return predicates.stream()
//                .reduce(product -> true, Predicate::and);
    }
}

class Product {

}
