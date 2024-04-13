package numbersystem;

public class FindUniqueInArray {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 4, 5, 5};
        System.out.println(getUniqueEle(arr));
    }

    private static int getUniqueEle(int[] arr) {
        int xor = 0;

        for(int num : arr) {
            xor = xor ^ num;
        }
        return xor;
    }
}
