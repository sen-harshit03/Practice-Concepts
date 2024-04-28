package streams.match;

import java.util.Arrays;
import java.util.List;

/**
 * anyMatch: Upon first match, no further elements will be processed
 * allMatch: returns false upon first encounter of value which is not matching the condition.
 * noneMatch: returns false upon first match
 */
public class Match {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 5, 6, 7, 4, 2);

        boolean anyMatch = list.stream().anyMatch(n -> {
            System.out.println(n);  // 1 5 6 true
            return n % 2 == 0;
        });

        boolean allMatch = list.stream().allMatch(n -> {
            System.out.println(n);  // 1 false
            return n % 2 == 0;
        });


        boolean noneMatch = list.stream().noneMatch(n -> {
            System.out.println(n);  // 1 5 6 false
            return n % 2 == 0;
        });


        System.out.println(allMatch);

    }

}
