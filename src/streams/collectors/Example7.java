package streams.collectors;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Example7 {
    public static void main(String[] args) {
        /**
         * PartitioningBy(Predicate exp)
         * 1.  Takes a Predicate expression for partitioning
         */

        List<String> list = List.of("AAA","B","CCCCC","DDD", "FFFFFF", "AAA");

        Map<Boolean, List<String>> map1 = list.stream()
                .collect(Collectors.partitioningBy(s -> s.length() % 2 == 0));

        System.out.println(map1); // {false=[AAA, B, CCCCC, DDD, AAA], true=[FFFFFF]}

        /**
         * PartitioningBy(Predicate exp, Collector downstream)
         * 1. Predicate expression
         * 2. Collector downstream
         */

        Map<Boolean, Set<String>> map2 = list.stream()
                .collect(Collectors.partitioningBy(s -> s.length() % 2 == 0, Collectors.toSet()));

        System.out.println(map2);


        Map<Boolean, String> map3 = list.stream()
                .collect(Collectors.partitioningBy(s -> s.length() % 2 == 0, Collectors.joining()));
        System.out.println(map3);
    }
}
