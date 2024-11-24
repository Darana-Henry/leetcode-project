//https://leetcode.com/problems/thousand-separator/
package algorithms.easy.t;

public class ThousandSeparator {
    public static void main(String[] args) {
        ThousandSeparator separator = new ThousandSeparator();
        System.out.println("Output:\t" + separator.thousandSeparator(987));
        System.out.println("Output:\t" + separator.thousandSeparator(1234));
    }

    public String thousandSeparator(int n) {
        int count = 0;
        StringBuilder sb = new StringBuilder();

        while (true) {
            int digit = n % 10;
            n /= 10;
            sb.append(digit);
            count++;

            if (n == 0) break;

            if (count == 3) {
                sb.append(".");
                count = 0;
            }
        }
        return sb.reverse().toString();
    }
}
