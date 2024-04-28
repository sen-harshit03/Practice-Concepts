package collections.list;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * ADD:
 * add -> add at specified index
 *
 *
 * REMOVE
 * remove -> removes from the specified index
 *
 *
 * GET and SET
 * get -> gets the object from the specified index
 * set -> sets the object at specified index
 *
 *
 * COPY
 * copyOf: takes a collection and returns the Immutablelist (should not contain null values)
 *
 * INDEX OF ELE
 * indexOf: Returns the index of the first occurrence of the specified element
 * lastIndexOf: Returns the index of the last occurrence of the specified element
 *
 *
 * SUBLIST
 * subList: returns a list of from starIdxInclusive to endIdxExclusive.
 *
 *
 * SORT
 * sort: takes a comparator and sorts the list based on it.
 *
 *
 * ITERATOR:
 * listIterator: returns the listIterator over the elements of the collection

 */
public class ListApis {
    public static void main(String[] args) {
//        Method[] listMethods = List.class.getDeclaredMethods();
//        for (Method method : listMethods) {
//            System.out.println(method.getName());
//        }

        Method[] arrayListMethods = ArrayList.class.getDeclaredMethods();
        for (Method method : arrayListMethods) {
            System.out.println(method.getName());
        }

        ArrayList<Integer> integers = new ArrayList<>();
        integers.ensureCapacity(5);
        for (int i = 0; i < 10; i++) {
            integers.add(i);
        }
    }
}
