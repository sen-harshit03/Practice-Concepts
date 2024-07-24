package streams.practice;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exampl1 {
    public static void main(String[] args) {
        List<String> strings = List.of("Apple", "Harshit", "Joker", "Bobbie");
        // Apple - 2, Harshit - 2, Joker - 2, Bobbie - 3

        Map<String, Long> vowelCount = strings.stream()
                .collect(Collectors.toMap(
                        Function.identity(),
                        Exampl1::countVowels,
                        (len1, len2) -> len1,
                        LinkedHashMap::new
                ));

        System.out.println(vowelCount);
    }

    private static long countVowels(String str) {
        return str.chars()
                .filter(c -> "AEIOUaeiou".indexOf(c) != -1)
                .count();
    }
}
