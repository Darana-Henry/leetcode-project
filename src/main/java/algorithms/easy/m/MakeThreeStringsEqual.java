//https://leetcode.com/problems/make-three-strings-equal/
package algorithms.easy.m;

public class MakeThreeStringsEqual {
    public static void main(String[] args) {
        MakeThreeStringsEqual remove = new MakeThreeStringsEqual();
        System.out.println("Output:\t" + remove.findMinimumOperations("abc", "abb", "ab"));
        System.out.println("Output:\t" + remove.findMinimumOperations("dac", "bac", "cac"));
    }

    public int findMinimumOperations(String s1, String s2, String s3) {
        int total = s1.length() + s2.length() + s3.length();
        int min = Math.min(s1.length(), Math.min(s2.length(), s3.length()));
        for (int i = 0; i < min; i++)
            if (!(s1.charAt(i) == s2.charAt(i) && s2.charAt(i) == s3.charAt(i))) return i == 0 ? -1 : total - 3 * i;
        return total - 3 * min;
    }
}
