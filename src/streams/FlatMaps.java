package streams;

import java.util.List;

/**
 * Map consumes one element from the stream and produces one element of the stream
 *
 * FlatMap consumes one element from the stream but can produce 0 to any number of values.
 */
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
