//https://leetcode.com/problems/hash-divided-string/description/
package algorithms.medium.h;

public class HashDividedString {
    public static void main(String[] args) {
        HashDividedString obj = new HashDividedString();
        System.out.println("Output:\t" + obj.stringHash("abcd", 2));
        System.out.println("Output:\t" + obj.stringHash("mxz", 3));
    }

    public String stringHash(String s, int k) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i += k) {
            int sum = 0;

            for (int j = i; j < i + k; j++)
                sum += s.charAt(j) - 'a';

            sb.append((char) ('a' + sum % 26));
        }
        return sb.toString();
    }
}
