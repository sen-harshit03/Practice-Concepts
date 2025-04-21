package collections.demo;

import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.TreeSet;

public class SetDesign {
    public static void main(String[] args) {

        var identityHashMap = new IdentityHashMap<String, Boolean>();

        var identityHashSet = Collections.newSetFromMap(identityHashMap);

        var hashSet = new HashSet<String>();

        var treeSet = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);  // Comparator of string class, does comparison in case-insensitive fashion.

        identityHashSet.add(String.valueOf('a'));
        identityHashSet.add(String.valueOf('a'));
        identityHashSet.add(String.valueOf('A'));
        identityHashSet.add(String.valueOf('A'));

        System.out.println(identityHashSet);  // [a, a, A, A] -> look mom, I have duplicates in set 😎


        hashSet.addAll(identityHashSet);
        System.out.println(hashSet);  // [a, A]  -> Huh! Where are my duplicates 🙄

        treeSet.addAll(hashSet);
        System.out.println(treeSet);  // [a] -> Something weird happening, my elements are getting disappeared 😰


        System.out.println(identityHashSet.contains("A"));  // false -> WHAT!! Stop lying 😡 I can clearly see two A's.


        System.out.println(treeSet.contains("A"));   // true -> But I can only see one element in treeSet 'a'
        System.out.println(treeSet.contains("a"));  // true


        treeSet.add("b");
        System.out.println(treeSet);  // [a, b]

        treeSet.add("B");
        System.out.println(treeSet); // [a, b]

        System.out.println(treeSet.equals(hashSet)); // true -> STFU!!! How is this even POSSIBLE?

        System.out.println(hashSet.equals(treeSet));  // false -> Enough!!! Stop playing with my mind 🤔

        /**
         * Set defines "No pair of elements e1 and e2 such that e1.equals(e2).
         *
         * Works well with HashSet, LinkedHashSet and EnumSet
         *
         * What about other types of sets? What is duplicate for them
         *
         * SO WHAT ACTUALLY IS DUPLICATE?
         * - Depends on the set implementation.
         * - Duplicates are pairs that satisfy equivalence relation
         *
         * HashSet: equivalence relation -> e1.equals(e2)
         * Sets based on IdentityHashMap -> e1 == e2
         * SortedSet implementations -> compare(e1, e2) == 0 or  e1.compareTo(e2) == 0
         *
         * As per the specifications of Comparison method of Comparable and Comparator, it should be consistent with equals()
         *
         *
         * WHAT IS CONSISTENT WITH EQUALS?
         * compare(e1, e2) == 0 iff e1.equals(e2)
         * e1.compare(e2) == 0 iff e1.equals(e2)
         *
         * String.compareTo() -> consistent with equals
         * String.CASE_INSENSITIVE_ORDER (a comparator) -> Inconsistent with equals
         *
         *
         * How do set check for duplicate?
         *  - Does via contains method (in the AbstractSet)
         *
         *  equals method within the set calls for the contains method
         */

        /**
         * System.out.println(treeSet.equals(hashSet)); // true -> STFU!!! How is this even POSSIBLE?
         *
         * TreeSet -> [a, b]     HashSet -> [a, A]
         *  treeSet.equals(hashSet)
         *
         *  this equals method internally called method contains(each element of hashset).
         *  treeSet.contains(a) -> true
         *  treeSet.contains(A) -> true, coz of case-insensitive order which is inconsistent with equals
         *
         *  So, overall treeSet.equals(hashSet) -> TRUE
         */


        /**
         * System.out.println(hashSet.equals(treeSet)); // false -> Enough!!! Stop playing with my mind 🤔
         * HashSet -> [a, A]  TreeSet -> [a, b]
         *
         * hashSet.equals(treeSet) -> false
         * this equals method on hashset internally called the contains method on each element of the treeSet
         * hashSet.contains(a) -> True
         * hashSet.contains(b) -> Nope -> false
         *
         * So, overall hashset.equals(treeSet) is false
         *
         * Remember all this contains phenomena happens after if compare the size.
         * So, lets say
         * hashSet[A,a]  treeSet[a] -> in both way equals check it will be false
         *
         *
         * So, if we call equals between two sets with same equivalence relation -> Fine
         *   but if we call equals between two sets with different equivalence relation -> Strange behaviour
         */






    }
}
