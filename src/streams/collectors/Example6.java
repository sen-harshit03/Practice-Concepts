package streams.collectors;

import java.util.List;
import java.util.stream.Collectors;

public class Example6 {
    public static void main(String[] args) {
        /**
         * Filtering:
         * 1. Predicate expression
         * 2. Downstream Collector
         */

        List<String> list = List.of("AAA","B","CCCCC","DDD", "FFFFFF", "AAA");
        List<String> string = list.stream()
                .collect(Collectors.filtering(s -> s.length() % 2 == 0, Collectors.toList()));

        System.out.println(string);

//        this is similar to
        List<String> ex2 = list.stream()
                .filter(s ->  s.length() % 2 == 0)
                .collect(Collectors.toList());
    }
}
