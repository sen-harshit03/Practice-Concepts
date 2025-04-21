package polymorphism;

public class Example1 {
    public static void main(String[] args) {
        Example1 example1 = new Example1();
//        example1.m1(10);

        // String -> Immutable
        // StringBuilder -> Mutable (Thread safe not)
        // StringBuffer -> Mutable (Thread safe)
    }

    public void m1(String a) {
        System.out.println(a);
    }

    public void m1(StringBuilder a) {
        System.out.println(a);
    }
}
