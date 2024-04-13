package generics.inheritancegeneric.example1;

/**
 * Car <T> extends Vehicle <G>
 */
public class Main {
    public static void main(String[] args) {
        /**
         * Car <Integer> but the type of Vehicle will be an object
         */
        Car<Integer> c = new Car<>();
        c.field = "Ha";
        c.field = 10;
        c.field = 'a';
    }
}
