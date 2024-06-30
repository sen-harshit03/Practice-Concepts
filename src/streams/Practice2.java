package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("abc", "123", "32", "2as");

        // ans = 123 32 2
        words.stream()
                .filter(w -> w.matches("\\d+"))
                .toList()
                .forEach(a -> System.out.println(a));

    }

}
