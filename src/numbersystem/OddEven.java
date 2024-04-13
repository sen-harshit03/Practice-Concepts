package numbersystem;

public class OddEven {
    public static void main(String[] args) {
        int num = 10;
//        System.out.println(isEven(num));
        System.out.println(getEvenOrOdd(num));
    }

    private static String getEvenOrOdd(int num) {
        int ans = num & 1;

        if(ans == 1) return "ODD";
        return "EVEN";
    }




    // WAY 2 :


    // WAY 1:
    private static String isEven(int num) {
        if(num == 0) return "EVEN";
        String binary = getBinaryRepresentation(num);
        if(binary.charAt(binary.length()-1) == '0') {
            return "EVEN";
        }
        return "ODD";
    }


    private static String getBinaryRepresentation(int decimal) {
        StringBuilder binary = new StringBuilder();

        while(decimal > 0) {
            int rem = decimal % 2;
            binary.insert(0, rem);
            decimal /= 2;
        }
        return binary.toString();
    }

}



/**              8  4   2  1
 *          10 = 1  0   1  0
 *
 *               16 8  4  2  1
 *          19 = 1  0  0  1  1
 *
 *
 *          AND
 *          0 0  0
 *          0 1  0
 *          1 0  0
 *          1 1  1
 *
 *
 *          LSB = 0/1
 *          0 -> even
 *          1 -> ODD
 *
 *          0 & 1 = 0
 *          1 & 1 = 1
 *
 *          int ans = num & 1
 *          ans = 1 - odd
 *          ans = 0 - Even
 *
 *
 *
 *
 *
 *
 */
// 10 = 1 0 1 0
