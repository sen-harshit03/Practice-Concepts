package switchexp;

import java.util.Objects;

public class PatternMatchingWithInstanceOf {
    public static void main(String[] args) {
//        System.out.println(process(1));
//        System.out.println(process("Hello"));

        System.out.println(guessType(1));
        System.out.println(guessType(1.0));
        System.out.println(guessType("Hello"));
    }

    private static String guessType(final Object input) {
        return switch (input) {
            case Integer i -> "Got an integer";
            case Double d -> "Got a double";
            case String s -> "Got a string of length  " + s.length();
            default -> "Whatever";
        };
    }

//    private static String process(final Object input) {
//        return switch (input) {
//            default -> "Whatever";
//
//        };
//    }
//    private static String process(final Object input) {
//        if (input instanceof Integer) {
//            return "Got an integer";
//        } else if (input instanceof String) {
//            return "Got an string of length " + ((String) input).length();  // eww type casting
//        }
//        return "whatever";
//    }

    private static String process(final Object input) {
        if (input instanceof Integer) {
            return "Got an integer";
        } else if (input instanceof String str) {
            return "Got a string of length " + str.length();  // eww type casting
        }
        return "whatever";
    }
}
