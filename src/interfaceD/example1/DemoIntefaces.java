package interfaceD.example1;

public abstract interface DemoIntefaces {
    // field
    int CONST_VAR = 10;         // public static final CONST_VAR = 10;

    // methods
    abstract void abstractMethod();

    public default void defaultMethod() {
        System.out.println("Default method");
    }

    private static void staticPrivateMethod() {
        System.out.println("Static private method");
    }

    public static void staticPublicMethod() {
        System.out.println("Static public method");
    }
}
