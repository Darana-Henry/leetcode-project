//https://leetcode.com/problems/find-the-longest-balanced-substring-of-a-binary-string/
package algorithms.easy.f;

public class FindTheLongestBalancedSubstringOfABinaryString {
    public static void main(String[] args) {
        FindTheLongestBalancedSubstringOfABinaryString longest = new FindTheLongestBalancedSubstringOfABinaryString();
        System.out.println("Output:\t" + longest.findTheLongestBalancedSubstring("01000111"));
        System.out.println("Output:\t" + longest.findTheLongestBalancedSubstring("00111"));
        System.out.println("Output:\t" + longest.findTheLongestBalancedSubstring("111"));
    }

    public int findTheLongestBalancedSubstring(String s) {
        int answer = 0;

        for (int i = 1; i < 51; i++) {
            String curr = "0".repeat(i) + "1".repeat(i);
            if (s.contains(curr)) answer = i * 2;
            else break;
        }

        return answer;
    }
}
