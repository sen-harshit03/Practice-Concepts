package streams.collectors;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Example1 {
    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);

        // toList
        List<Integer> integers = list.stream()
                // intermediate operations
                .collect(Collectors.toList());

        // toSet
        Set<Integer> set = list.stream()
                .collect(Collectors.toSet());


        // If we want any specific implementation for our list or set (like treeSet) -> toCollection
        Set<Integer> sortedSet = list
                .stream()
                .collect(Collectors.toCollection(() -> new TreeSet<>()));


    }
}

