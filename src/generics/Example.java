package generics;

public class Example {
    public static void main(String[] args) {
        /**
         * Right Side diamond bracket is the "type" of the generic type.
         * Left Side diamond bracket specifies the constraints, that what are we allowed to allocate.
         */
        Foo<String> foo1 = new Foo<String>();
        foo1.x = "Hello";

        Foo f2 = new Foo();  //  This still works as if type is not passed then the type used by the compiler is Object.
    }
}
