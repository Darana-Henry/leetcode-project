//https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/
package algorithms.easy;

public class SubstringsOfSizeThreeWithDistinctCharacters {
    public static void main(String[] args) {
        SubstringsOfSizeThreeWithDistinctCharacters size3 = new SubstringsOfSizeThreeWithDistinctCharacters();
        System.out.println("Output:\t" + size3.countGoodSubstrings("xyzzaz"));
        System.out.println("Output:\t" + size3.countGoodSubstrings("aababcabc"));
    }

    public int countGoodSubstrings(String s) {
        int answer = 0;
        for (int i = 2; i < s.length(); i++) {
            int a = s.charAt(i - 2) - 'a';
            int b = s.charAt(i - 1) - 'a';
            int c = s.charAt(i) - 'a';

            if (a != b && b != c && a != c) answer++;
        }
        return answer;
    }
}
