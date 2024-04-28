package streams.collectors;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Example5 {
    public static void main(String[] args) {
        List<String> list = List.of("AAA","B","CCCCC","DDD", "FFFFFF", "AAA");

        List<Integer> res  = list.stream()
                .collect(Collectors.mapping(s -> s.length(),
                        Collectors.toList()));

        /**
         * Mapping takes
         * 1. A mapper Function
         * 2. A downstream Collector
         */



        System.out.println(res);

    }
}
