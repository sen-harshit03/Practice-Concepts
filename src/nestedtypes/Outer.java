package nestedtypes;

public class Outer {
    int var1;
    static int var2;
    private int var3;


    class Inner {
        void doSomething() {
            var1 = 10;
            Outer.this.var1 = 15;
            var3 = 10;
        }
    }

    static class InnerStatic {
        void doSomething() {
            var2 = 10;
            Outer.var2 = 15;
        }
    }
}
