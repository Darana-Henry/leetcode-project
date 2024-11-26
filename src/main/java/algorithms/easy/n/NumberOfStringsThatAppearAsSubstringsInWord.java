//https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/
package algorithms.easy.n;

public class NumberOfStringsThatAppearAsSubstringsInWord {
    public static void main(String[] args) {
        NumberOfStringsThatAppearAsSubstringsInWord number = new NumberOfStringsThatAppearAsSubstringsInWord();
        System.out.println("Output:\t" + number.numOfStrings(new String[]{"a", "abc", "bc", "d"}, "abc"));
        System.out.println("Output:\t" + number.numOfStrings(new String[]{"a", "b", "c"}, "aaaaabbbbb"));
        System.out.println("Output:\t" + number.numOfStrings(new String[]{"a", "a", "a"}, "ab"));
    }

    public int numOfStrings(String[] patterns, String word) {
        int answer = 0;

        for (String pattern : patterns)
            if (word.contains(pattern)) answer++;

        return answer;
    }
}
