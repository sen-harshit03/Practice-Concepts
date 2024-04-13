package numbersystem;

public class DecimalToBinary {
    public static void main(String[] args) {
        int decimalNumber = 10;
        System.out.println(getBinaryRep(decimalNumber));

        String binaryNumber = "1010";
        System.out.println(getDecimalRep(binaryNumber));
    }

    private static int getDecimalRep(String binary) {
        int power = 0;
        int decimal = 0;

        for(int i = binary.length()-1; i >= 0; i--) {
            char bit = binary.charAt(i);

            if(bit == '1') {
                decimal += (Math.pow(2, power));
            }
            power++;
        }
        return decimal;
    }

    private static String getBinaryRep(int decimal) {
        StringBuilder binary = new StringBuilder();

        while(decimal > 0) {
            int remainder = decimal % 2;
            binary.insert(0, remainder);
            decimal = decimal / 2;
        }

        return binary.toString();
    }
}
