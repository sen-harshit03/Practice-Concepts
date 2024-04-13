package generics;

/**
 * Left diamond tells us what we are allowed to have as a "type" for my generic type.
 * For eg. For f1 and f5 we are only allowed to have Integer and Number respectively.
 *
 * If we use any "Precise type" as constraint, then the type of generic should be the precise only. not any super or sub class.
 *
 * But for f3, we can have anything that extends the Number class (Integer, Double, Number, Float...) and Number class itself.
 * And for f4, we can have anything that Number class extends and Number class itself.
 *
 * Foo<Object> vs Foo<?>
 *     If we use Object as a constraint, we can only have Object as a generic type, no child classes.
 *     BUt if we use ? as a constraint, we can anything as a generic type/.
 *
 */
public class LeftSide {
    public static void main(String[] args) {


        Foo<Integer> f1;

        /**
         * Any object wildcard
         */
        Foo<?> f2;

        /**
         * Any object which extends Number class (Subtypes of Number1)
         */
        Foo<? extends Number> f3;

        /**
         * Any object which Number extends (Super type of Number)
         */
        Foo<? super Number> f4;   // any object which Number extends (super types)

        Foo<Number> f5;



        f1 = new Foo<Integer>();
        f5 = new Foo<Number>();  // It should be precise, no inheritance work in this case

        f3 = new Foo<Number>();
        f3 = new Foo<Integer>();
        f3 = new Foo<Double>();
//        f3 = new Foo<String>();  error
//        f3 = new Foo<Object>();  error

        f4 = new Foo<Number>();
        f4 = new Foo<Object>();



    }
}
