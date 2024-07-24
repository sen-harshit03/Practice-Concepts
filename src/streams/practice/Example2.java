package streams.practice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Example2 {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("Harshit", 10, "Akash", 210, "Carlos", 185);
        System.out.println(sortByKey(map));
        System.out.println(sortByValue(map));

    }

    private static Map<String, Integer> sortByValue(Map<String, Integer> map) {
        Map<String, Integer> sortedByValue = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (v1, v2) -> v1,
                        LinkedHashMap::new
                ));
        return sortedByValue;
    }

    private static Map<String, Integer> sortByKey(Map<String, Integer> map) {
        Map<String, Integer> sortedByKey = map.entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (v1, v2) -> v2,
                        TreeMap::new
                ));
        return sortedByKey;
    }
}
