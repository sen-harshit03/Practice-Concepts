package exceptionHandling.example1;

public class Example1 {
    public static void main(String[] args) {

        try {
            m();
            System.out.println("Executed");
        } finally {
            System.out.println(" :)");
        }
    }

    private static int m() {
        return 1/1;
    }
}
