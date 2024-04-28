package streams;

import java.util.List;

public class FlatMaps {
    public static void main(String[] args) {
        List<List<Integer>> list = List.of(
                List.of(1, 2, 3, 4, 5),
                List.of(4, 5, 6),
                List.of(7, 8)
        );

        int sum = list.stream()
                .flatMap(t -> t.stream())
                .reduce(0, Integer::sum);

        // flatMap: Steam<List<Integer>> -> Stream<Integer>
        System.out.println(sum);

        // Similar to map, we have flatMapToInt




    }
}
