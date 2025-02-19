//https://leetcode.com/problems/find-special-substring-of-length-k/
package algorithms.easy.f;

public class FindSpecialSubstringOfLengthK {
    public static void main(String[] args) {
        FindSpecialSubstringOfLengthK obj = new FindSpecialSubstringOfLengthK();
        System.out.println("Output:\t" + obj.hasSpecialSubstring("aaabaaa", 3));
        System.out.println("Output:\t" + obj.hasSpecialSubstring("abc", 2));
    }

    public boolean hasSpecialSubstring(String s, int k) {
        int n = s.length(), i = 0;

        for (int j = 0; j < n; j++) {
            if (s.charAt(i) == s.charAt(j)) continue;
            if (j - i == k) return true;
            i = j;
        }
        return (n - i) == k;
    }
}
