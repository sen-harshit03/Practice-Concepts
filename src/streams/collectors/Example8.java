package streams.collectors;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Example8 {
    public static void main(String[] args) {
        /**
         * GroupingBy (Function)
         *
         */

        List<String> list = List.of("AAA","B","CCCCC","DDD", "FFFFFF", "AAA");

        Map<Integer, List<String>> map1 = list.stream()
                .collect(Collectors.groupingBy(String::length));  // s -> s.length()

        System.out.println(map1); // {1=[B], 3=[AAA, DDD, AAA], 5=[CCCCC], 6=[FFFFFF]}

        /**
         * GroupingBy
         * 1. Function
         * 2. DownStream Collector
         */

        Map<Integer, Set<String>> map2 = list.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.toSet()));
        System.out.println(map2);
    }
}
