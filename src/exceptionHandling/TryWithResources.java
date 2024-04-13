package exceptionHandling;

/**
 *  To use try with Resources, it is mandatory that the extending class must implement AutoClosable interface.
 */
public class TryWithResources {
    public static void main(String[] args) {
        /**
         * Java - 7
         */

        try(A a = new A();
            B b = new B()) {  // B will be closed first then A

        } catch (Exception e) {
            System.out.println("Catching...");
        } finally {
            System.out.println("Finally");
        }


        /**
         * From Java - 9
         */

        A a1 = new A();  // Any exception thrown here won't get caught by the catch block
        B b1 = new B();

        try(a1; b1) {

        } catch (Exception e) {
            System.out.println("Catching...");
        }


    }

}

class A implements AutoCloseable {

    @Override
    public void close() {
        System.out.println("Closing A...");
    }
}

class B implements AutoCloseable {

    @Override
    public void close() {
        System.out.println("Closing B...");
    }
}


