//https://leetcode.com/problems/sum-of-digits-of-string-after-convert/
package algorithms.easy.s;

public class SumOfDigitsOfStringAfterConvert {
    public static void main(String[] args) {
        SumOfDigitsOfStringAfterConvert convert = new SumOfDigitsOfStringAfterConvert();
        System.out.println("Output:\t" + convert.getLucky("iiii", 1));
        System.out.println("Output:\t" + convert.getLucky("leetcode", 2));
        System.out.println("Output:\t" + convert.getLucky("zbax", 2));
    }

    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray())
            sb.append((ch - 'a') + 1);

        String sum = sb.toString();
        for (int i = 1; i <= k; i++) {
            int transformedSum = 0;
            for (char ch : sum.toCharArray())
                transformedSum += ch - '0';

            sum = String.valueOf(transformedSum);
        }
        return Integer.parseInt(sum);
    }
}
