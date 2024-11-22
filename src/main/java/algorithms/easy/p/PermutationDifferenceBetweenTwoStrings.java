//https://leetcode.com/problems/permutation-difference-between-two-strings/
package algorithms.easy.p;

public class PermutationDifferenceBetweenTwoStrings {
    public static void main(String[] args) {
        PermutationDifferenceBetweenTwoStrings permutation = new PermutationDifferenceBetweenTwoStrings();
        System.out.println("Output:\t" + permutation.findPermutationDifference("abc", "bac"));
        System.out.println("Output:\t" + permutation.findPermutationDifference("abcde", "edbac"));
    }

    public int findPermutationDifference(String s, String t) {
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int index = t.indexOf(ch);
            answer += Math.abs(index - i);
        }

        return answer;
    }
}
