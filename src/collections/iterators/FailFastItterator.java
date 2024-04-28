package collections.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Fail fast iterator: immediately fails the program and throw ConcurrentModificationException
 * when some modification is done while iterating over the collection.
 *
 * Here in this example the moment I try to do any CRUD an element, instantly it throws ConcurrentModificationException.
 *
 * Similarly, we have non-Fast Fail Iterators, which are returned by the ConcurrentCollections.
 * They do not throw any exception coz, they iterate over the copy of the elements of the collection.
 *
 */
public class FailFastItterator {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("Orange");

        Iterator<String> itr = fruits.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
            fruits.add("Mango");
        }
    }

}

