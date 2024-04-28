package streams.creation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class StreamCreation {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 2, 7, 8, 9, 6));

        /**
         * Stream creation
         */
        Stream<Integer> stream1 = Stream.empty(); // Creates an empty stream

        Stream<Integer> stream2 = Stream.of(1, 2, 3 , 4, 5);

        Stream<Integer> stream3 = list.stream();

        Stream.Builder<Integer> builder = Stream.builder();
        builder.add(10).add(20).add(30).add(40).build();
        Stream<Integer> stream4 = builder.build();

        Stream<Integer> stream5 = Stream.generate(() -> new Random(100).nextInt()).limit(10);

        Stream<Integer> stream6 = Stream.iterate(1, n -> n + 1).limit(10);

    }
}
