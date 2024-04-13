package numbersystem;

public class GetKthBit {
    public static void main(String[] args) {
        int num = 22;
        int k = 3;

        System.out.println(getKthBit(num, k));
    }

    private static int getKthBit(int num, int k) {
        int shiftedNum = 1 << k-1;

        int andOperatedNum = num & shiftedNum;
        if(andOperatedNum == 0) return 0;
        return 1;
    }
}

/**
 *
 *             19 = 1  0  0  1  1
 *                  0  1  0  0  0
 *                  0  0  0  0  0 -> The bit was 0
 *
 *             22 = 1 0 1 1 0
 *                  0 0 1 0 0
 *                  0 0 1 0 0 -> the bit was 1
 *
 *
 */
