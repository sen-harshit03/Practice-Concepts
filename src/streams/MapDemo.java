package streams;

import java.util.List;

/**
 *  Given, Stream
 *  map(): Stream -> Stream
 *  mapToInt(): Stream -> IntStream
 *  mapToLong(): Stream -> LongStream
 *  mapToDouble(): Stream -> DoubleStream
 *
 *
 *  Given, IntStream
 *  map(): IntStream -> IntStream
 *  mapToLong(): IntStream -> LongStream
 *  mapToDouble(): IntStream -> DoubleStream
 *  mapToObj(): Instream -> Stream
 */
public class MapDemo {
    public static void main(String[] args) {
        List<String> list = List.of("abcd", "qwerty", "asdfg");
        int lengthSum = list.stream()
                .map(str -> str.length())
                .reduce(0, (a, b) -> a + b);

        System.out.println(lengthSum);

        int lengthSum1 = list.stream()
                .mapToInt(str -> str.length())
                .sum();
        System.out.println(lengthSum1);

        var x = list.stream()
                .mapToInt(s -> s.length())
                .mapToObj(s -> s)
                .mapToInt(s -> s)
                .mapToObj(s -> s)
                .mapToInt(s -> s)
                .sum();

    }
}
