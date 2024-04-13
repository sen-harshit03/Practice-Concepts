package generics.doublegeneric;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Boo<String, Integer> boo1 = new Boo<String, Integer>();

        Boo<?, Integer> boo2 = new Boo<Double, Integer>();

        Boo<Integer, ?> boo3 = new Boo<Integer, String>();
        Boo<Integer, ? extends Number> boo4 = new Boo<Integer, Integer>();

    }
}
