package collections.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ImmutableCollections {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4);  // array -> [1, 2, 3, 4] -> returns a view of backing array
        // Array.add -> X       Array.remove -> X       Array.set(idx, val) -> Yes
//        list.add(10); UnsupportedOperationException
//        list.remove(0); UnsupportedOperationException
        list.set(0, 10); // Works 🥰
        System.out.println(list);

        Map<Integer, Boolean> map = new HashMap<>();
//        map.keySet().add(10); UnsupportedOperationException -> coz, what would be the value corresponding to this key
        map.keySet().remove(10);  // This works 😎


        List<Integer> integers = Collections.unmodifiableList(List.of(1, 2, 3, 4, 5));
//        integers.add(10);   Not Allowed 😡
//        integers.remove(1);  Not allowed
//        integers.set(1, 10);   Not Allowed

        /**
         * Unmodifiability vs Immutability
         *
         * Unmodifiability: Collection's content cannot be changed
         * Immutability: The whole object graph cannot be changed.
         *
         *
         * Immutable Collections are hard
         *
         * But we can achieve Unmodifiability easily in java:
         * - Level of modifications:
         * 1. Everyone can modify (our general mutable collections like ArrayList)
         * 2. Owner of the collection can only modify (Collections.unmodifiableList())
         * 3. Nobody can modify (List.of())
         *
         *
         * The main issue is there are some methods which are optional, like for Arrays.asList() -> we can set but not add or remove
         * But, it doesn't stop us from calling optional methods (like add or remove), although calling those methods
         * would cause us UnsupportedOperationException.
         *
         * So, do we get Immutable Collections:
         * 1. Guava: Guava provides Immutable collections (ImmutableList), but it implements the Collection contract, so
         *   it also exposes the optional methods, tho those will fail with UnsupportedOperationException.
         */







    }
}
