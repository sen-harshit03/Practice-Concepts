package interfaceD.example1;

import java.util.Collection;
import java.util.List;

/**
 *       Interface in java is just a class as any other java with some features, it is VAGUE in nature (not concrete)
 *       Used to expose the contracts.
 *       we cannot create an instance of an interface.
 *       Used to achieve polymorphism.
 *
 *       Things which we can have inside our interface.
 *       - Field : YES
 *       - Constructor : NO
 *       - Methods/Behaviours : YES
 *
 *       Field:
 *       - Public static final: CONSTANT
 *
 *       public: so that all the concrete classes which implements the interface can have access to it.
 *       final: so that concrete classes should not be able to reassign it.
 *       static: static variable are independent of the object and also we cannot create an instance of an interface, which
 *               means we should be able to access this field by making it static variable only.
 *
 *
 *       Methods/Behaviour:
 *       - public abstract void abstractMethod();
 *       - public default void defaultMethod() {}
 *       - public static void staticPublicMethod() {}
 *       - private static void staticPrivateMethod() {}
 *
 *
 *       We are able to have abstract method inside the interface coz, interfaces are abstract implicitly.
 *       public interface I {}  ==  public abstract interface I {}
 *       abstract is added by the compiler, implicitly
 *
 *
 *
 *
 *
 */
public class Main {
    public static void main(String[] args) {
        Iplayable p1 = new Piano();
        p1.method1();


    }
}
