package streams.collectors;

import java.util.List;
import java.util.stream.Collectors;

public class Example3 {
    public static void main(String[] args) {
        List<String> list1 = List.of("AAA", "BBBB", "CCCCC", "DDDDDD");

        /**
         * joining is used to join:
         * 1. joining() -> simple joining
         */
        String concatenatedString = list1.stream()
                .collect(Collectors.joining());
        System.out.println(concatenatedString); // AAABBBBCCCCCDDDDDD


        /**
         * 2. joining (delimeter)
         */
        String concatenatedByComma = list1.stream()
                .collect(Collectors.joining(", "));
        System.out.println(concatenatedByComma);  // AAA, BBBB, CCCCC, DDDDDD



        /**
         * 3. joining(delimeter, prefix, suffix)
         */

        String addingPrefixAndSuffix = list1.stream()
                .collect(Collectors.joining(", ", "[", "]"));

        System.out.println(addingPrefixAndSuffix);  // [AAA, BBBB, CCCCC, DDDDDD]

    }
}
