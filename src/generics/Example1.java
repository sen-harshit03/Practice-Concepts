package generics;

/**
 *  So when we define constrainsts using wildcards or wildcards extends any class, then we won't be able to change the
 *  value of the variable.
 *
 */
public class Example1 {
    public static void main(String[] args) {
        Foo<Integer> foo1 = new Foo<Integer>();

        Foo<?> foo2 = new Foo<Number>();
//        foo3.x = 20;  compile time error

        Foo<? extends Number> foo3 = new Foo<Integer>();
//        foo2.x = 10;  compile time error

        Foo<? super Number> foo4 = new Foo<Number>();
        foo4.x = 10;
    }
}
