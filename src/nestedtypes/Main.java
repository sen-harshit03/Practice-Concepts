package nestedtypes;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        // Creating outer class instance
        Outer outer = new Outer();

        // Creating innerstatic class instance
        Outer.InnerStatic innerStaticObj = new Outer.InnerStatic();

        // Creating inner class instance
        Outer.Inner inner = outer.new Inner();
        Outer.Inner inner1 = new Outer().new Inner();

    }
}
