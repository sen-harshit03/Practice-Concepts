package numbersystem;

public class AddTwoNumbers {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;

        System.out.println(getSum(a, b));
    }

    private static int getSum(int a, int b) {
        int carry = 0;
        while(b != 0) {
            carry = a & b;
            a = a ^ b;            // a will be taking the sum
            b = carry << 1;       //  b will be carrying the carry
        }
        return a;
    }

}

/**
 *       ai bi si ci
 *       0  0  0  0
 *       0  1  1  0
 *       1  0  1  0
 *       1  1  0  1
 *
 *       si = a ^ b;
 *       ci = a & b;
 *
 *       so, sum of two bits we can find using the (xor)
 *       and if what carry will be generated will be decided using (AND)
 *
 *       But we apply carry to one digit left of it.
 *       Which means we have to left shift the carry by one place (<<)
 *
 */
