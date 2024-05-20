package algorithms.easy;

public class NumberOf1Bits {

    public static void main(String[] args) {

        NumberOf1Bits bits = new NumberOf1Bits();
        System.out.println("Output:\t" + bits.hammingWeight(2147483645));
        System.out.println("Output:\t" + bits.hammingWeightSimple(2147483645));

    }

    public int hammingWeight(int n) {
        int result = 0;
        int helper = 1;
        for (int i = 0; i < 32; i++) {
            if ((helper & n) != 0)
                result++;
            helper <<= 1;
        }
        return result;
    }

    public int hammingWeightSimple(int n) {
        int result = 0;
        while (n != 0) {
            n = n & (n - 1);
            result++;
        }
        return result;
    }
}
