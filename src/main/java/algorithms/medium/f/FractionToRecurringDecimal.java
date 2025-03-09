//https://leetcode.com/problems/fraction-to-recurring-decimal/
package algorithms.medium.f;

import java.util.HashMap;
import java.util.Map;

public class FractionToRecurringDecimal {
    public static void main(String[] args) {
        FractionToRecurringDecimal obj = new FractionToRecurringDecimal();
        System.out.println("Output:\t" + obj.fractionToDecimal(1, 2));
        System.out.println("Output:\t" + obj.fractionToDecimal(2, 1));
        System.out.println("Output:\t" + obj.fractionToDecimal(4, 33));
    }

    public String fractionToDecimal(int numerator, int denominator) {
        StringBuilder sb = new StringBuilder();
        if ((numerator < 0 && denominator > 0) || (numerator > 0 && denominator < 0)) sb.append("-");
        long num = Math.abs((long) numerator);
        long den = Math.abs((long) denominator);
        long quo = num / den;
        long rem = num % den;
        sb.append(quo);
        if (rem == 0) return sb.toString();
        sb.append(".");
        Map<Long, Integer> map = new HashMap<>();

        while (rem != 0) {
            if (map.containsKey(rem)) {
                int pos = map.get(rem);
                sb.insert(pos, "(");
                sb.append(")");
                return sb.toString();
            } else {
                map.put(rem, sb.length());
                rem *= 10;
                quo = rem / den;
                rem %= den;
                sb.append(quo);
            }
        }

        return sb.toString();
    }
}
