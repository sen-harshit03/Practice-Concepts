package collections;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.List;

/**
 ADD <p>
 add: adds the element to the last (append)
 addAll:  add all the value of the passed collection to current collection. <p>


 REMOVE and CLEAR <p>
 remove: removes the object
 removeIf: takes a predicate and removes the elements from the collection
 removeAll: removes all the elements from the collections which are also present in the passed collection.
 clear: empty the collection <p>


 OBJECT CLASS METHOD  <p>
 equals: overrides from the object class
 hashCode: overrides from the object class <p>


 SIZE AND EMPTY CHECK  <p>
 isEmpty: check if collection is empty
 size: returns the size of the collection  <p>


 ARRAY CONVERSION:  <p>
 toArray:
 toArray:
 toArray:  <p>


 ITERATOR  <p>
 iterator: returns an iterator over the elements in the collection
 spliterator: returns a splitIterator over the elements in the collection  <p>


 OBJECT PRESENT OR ABSENT  <p>
 contains: check if collection contains the object or not
 containsAll: returns true if all the elements specified in the passed collection is present inside the collection  <p>


 STREAM  <p>
 stream: converts the collection to a stream
 parallelStream: Creates a parallel stream  <p>


 MISC  <p>
 retainAll: retains the elements which are present inside the passed collection.  <p>
 */
public class CollectionApis {

    public static void main(String[] args) {
        Method[] arr = Collection.class.getDeclaredMethods();
        for(Method method : arr) {
            System.out.println(method.getName());
        }


    }

}
