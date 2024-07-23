//https://leetcode.com/problems/minimum-flips-to-make-a-or-b-equal-to-c/description/
package algorithms.medium;

public class MinimumFlipsToMakeAORBEqualToC {
    public static void main(String[] args) {
        MinimumFlipsToMakeAORBEqualToC flips = new MinimumFlipsToMakeAORBEqualToC();
        System.out.println("Output:\t" + flips.minFlips(2, 6, 5));
        System.out.println("Output:\t" + flips.minFlips(4, 2, 7));
        System.out.println("Output:\t" + flips.minFlips(1, 2, 3));
    }

    public int minFlips(int a, int b, int c) {
        int result = 0;

        for (int i = 0; i < 32; i++) {
            boolean ai = false;
            boolean bi = false;
            boolean ci = false;

            if ((a & (1 << i)) > 0)
                ai = true;

            if ((b & (1 << i)) > 0)
                bi = true;

            if ((c & (1 << i)) > 0)
                ci = true;

            if (ci) {
                if (!ai && !bi)
                    result++;
            } else {
                if (ai && bi)
                    result += 2;
                else if (ai || bi)
                    result++;
            }
        }
        return result;
    }
}
