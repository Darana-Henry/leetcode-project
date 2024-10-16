//https://leetcode.com/problems/number-of-common-factors/
package algorithms.easy.n;

public class NumberOfCommonFactors {
    public static void main(String[] args) {
        NumberOfCommonFactors common = new NumberOfCommonFactors();
        System.out.println("Output:\t" + common.commonFactors(12, 6));
        System.out.println("Output:\t" + common.commonFactors(25, 30));
    }

    public int commonFactors(int a, int b) {
        int gcdVal = gcd(a, b);
        int answer = 0;
        for (int i = 1; i * i <= gcdVal; i++) {
            if (gcdVal % i == 0) {
                answer++;
                if (i * i < gcdVal) answer++;
            }
        }
        return answer;
    }

    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
