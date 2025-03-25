//https://leetcode.com/problems/double-modular-exponentiation/
package algorithms.medium.d;

import java.util.ArrayList;
import java.util.List;

public class DoubleModularExponentiation {
    public static void main(String[] args) {
        DoubleModularExponentiation obj = new DoubleModularExponentiation();
        System.out.println("Output:\t" + obj.getGoodIndices(new int[][]{{2, 3, 3, 10}, {3, 3, 3, 1}, {6, 1, 1, 4}}, 2));
        System.out.println("Output:\t" + obj.getGoodIndices(new int[][]{{39, 3, 1000, 1000}}, 17));
    }

    public List<Integer> getGoodIndices(int[][] variables, int target) {
        int index = 0;
        List<Integer> answer = new ArrayList<>();

        for (int[] v : variables) {
            if (target == pMod(pMod(v[0], v[1], 10), v[2], v[3])) answer.add(index);
            index++;
        }

        return answer;
    }

    public long pMod(long a, long b, long m) {
        long answer = 1;
        a %= m;

        while (b > 0) {
            if (b % 2 == 1) answer = (answer * a) % m;
            a = (a * a) % m;
            b /= 2;
        }
        return answer;
    }
}
