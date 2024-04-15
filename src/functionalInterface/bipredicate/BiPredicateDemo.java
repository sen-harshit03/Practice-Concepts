package functionalInterface.bipredicate;

import java.util.function.BiPredicate;

/**
 *  BiPredicate <T, U>
 *      takes two params
 *      T: Type of param 1
 *      U:  Type of param 2
 *
 *      returns boolean value
 *
 */
public class BiPredicateDemo {
    public static void main(String[] args) {
        BiPredicate<String, String> areStringsEqual = (str1, str2) -> str1.equals(str2);
        System.out.println(areStringsEqual.test("Harshit", "Harshit"));
    }
}
