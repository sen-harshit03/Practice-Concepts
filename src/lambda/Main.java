package lambda;

public class Main {
    public static void main(String[] args) {
//        Instrument instrument = () -> System.out.println("Playing piano");
//        instrument.play();
//        Instrument instrument1 = () -> System.out.println("Playing Guitar");
//        instrument1.play();
        /**
         * Left side of the arrow
         */
        // 1 parameter functional interface
        ReverseInterface rev1 = str -> new StringBuffer().reverse().toString();
        ReverseInterface rev2 = (str) -> new StringBuffer().reverse().toString();
        ReverseInterface rev3 = (String str) -> new StringBuffer().reverse().toString();
        ReverseInterface rev4 = (var str) -> new StringBuffer().reverse().toString();

        // 2 or more para functional interface
        Calculator cal1 = (a, b) -> a + b;
        Calculator cal2 = (int a, int b) -> a + b;
        Calculator cal4 = (var a, var b) -> a + b;

        /**
         * Right side of the arrow
         */

        Calculator sumCal = (a, b) -> a + b;
        Calculator mulCal = (a, b) -> {
            return a * b;
        };

        Calculator divCal = (a, b) -> getDivision(a, b);

    }
    static int getDivision(int a, int b) {
        return a/b;
    }
}
