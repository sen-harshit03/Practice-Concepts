package streams.collectors;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Example2 {
    public static void main(String[] args) {
        // toMap
        List<String> strings1 = List.of("AAA", "BBBB", "CCCCC", "DDDDDD");
        Map<String, Integer> strToLengthMap1 = strings1.stream()
                .collect(Collectors.toMap(
                        s -> s,
                        s -> s.length()
                ));

        /**
         * We if try to have duplicate entry then, in that case we will get exception.
         * List<String> strings1 = List.of("AAA", "BBBB", "CCCCC", "DDDDDD", "AAA");
         * Exception in thread "main" java.lang.IllegalStateException:
         * Duplicate key AAA (attempted merging values 3 and 3)
         */

        // handle Duplicate Key
        List<String> strings2 = List.of("AAA", "BBBB", "CCCCC", "DDDDDD", "AAA");
        Map<String, Integer> strToLengthMap2 = strings2.stream()
                .collect(Collectors.toMap(
                        s -> s,
                        s -> s.length(),
                        (l1, l2) -> l2     // expression, to choose what to do in case of key collision
                ));
        System.out.println(strToLengthMap2);


        // if we want specific implementation of map, such as treeMap
        List<String> strings3 = List.of("AAA", "BBBB", "CCCCC", "DDDDDD", "AAA");
        Map<String, Integer> stringIntegerMap3 = strings3.stream()
                .collect(Collectors.toMap(
                        s -> s,
                        s -> s.length(),
                        (l1, l2) -> l2,
                        () -> new TreeMap<>()
                ));

        System.out.println(stringIntegerMap3);

    }
}
