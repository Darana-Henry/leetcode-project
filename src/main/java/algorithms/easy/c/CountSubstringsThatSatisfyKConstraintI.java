//https://leetcode.com/problems/count-substrings-that-satisfy-k-constraint-i/
package algorithms.easy.c;

public class CountSubstringsThatSatisfyKConstraintI {
    public static void main(String[] args) {
        CountSubstringsThatSatisfyKConstraintI count = new CountSubstringsThatSatisfyKConstraintI();
        System.out.println("Output:\t" + count.countKConstraintSubstrings("10101", 1));
        System.out.println("Output:\t" + count.countKConstraintSubstrings("1010101", 2));
        System.out.println("Output:\t" + count.countKConstraintSubstrings("11111", 1));
    }

    public int countKConstraintSubstrings(String s, int k) {
        int answer = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int zero = 0, one = 0;
            for (int j = i; j < n; j++) {
                if (s.charAt(j) == '0') zero++;
                else one++;

                if (zero <= k || one <= k) answer++;
            }
        }
        return answer;
    }
}
