package streams;

import java.math.BigInteger;
import java.util.stream.LongStream;

public class Factorial {
    public static void main(String[] args) {
        long num = 5;


        BigInteger result = LongStream.rangeClosed(1, num)
                .mapToObj(BigInteger::valueOf)
                .reduce(BigInteger.ONE, BigInteger::multiply);

        System.out.println(result);
    }
}
