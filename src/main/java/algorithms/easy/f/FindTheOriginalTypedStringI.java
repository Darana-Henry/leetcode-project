//https://leetcode.com/problems/find-the-original-typed-string-i/
package algorithms.easy.f;

public class FindTheOriginalTypedStringI {
    public static void main(String[] args) {
        FindTheOriginalTypedStringI original = new FindTheOriginalTypedStringI();
        System.out.println("Output:\t" + original.possibleStringCount("abbcccc"));
        System.out.println("Output:\t" + original.possibleStringCount("abcd"));
        System.out.println("Output:\t" + original.possibleStringCount("aaaa"));
    }

    public int possibleStringCount(String word) {
        int n = word.length();
        int answer = n;
        for (int i = 1; i < n; i++)
            if (word.charAt(i) != word.charAt(i - 1)) answer--;
        return answer;
    }
}
