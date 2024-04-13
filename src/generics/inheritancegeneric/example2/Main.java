package generics.inheritancegeneric.example2;

/**
 * Car <T> extends Vehicle <String>
 *     Like wise we can have anything as a constraints
 */
public class Main {
    public static void main(String[] args) {
        /**
         * Car <Integer> but the type of Vehicle will be an String
         */
        Car<Integer> c = new Car<>();
        c.field = "Ha";

    }
}
