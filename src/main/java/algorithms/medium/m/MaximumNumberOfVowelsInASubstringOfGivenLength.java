package algorithms.medium.m;

import java.util.ArrayList;

public class MaximumNumberOfVowelsInASubstringOfGivenLength {
    public static void main(String[] args) {
        MaximumNumberOfVowelsInASubstringOfGivenLength maximumVowels = new MaximumNumberOfVowelsInASubstringOfGivenLength();
        System.out.println("Output:\t" + maximumVowels.maxVowelsBruteForce("weallloveyou", 7));
        System.out.println("Output:\t" + maximumVowels.maxVowels("abciiidef", 3));
        System.out.println("Output:\t" + maximumVowels.maxVowelsBruteForce("aeiou", 2));
        System.out.println("Output:\t" + maximumVowels.maxVowels("leetcode", 3));

    }

    public int maxVowelsBruteForce(String s, int k) {
        ArrayList<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        int result = Integer.MIN_VALUE;

        for (int i = 0; i <= s.length() - k; i++) {
            int vowelCount = 0;
            String sub = s.substring(i, i + k);
            for (int j = 0; j < k; j++) {
                if (vowels.contains(sub.charAt(j)))
                    vowelCount++;
            }
            result = Math.max(result, vowelCount);
        }
        return result;
    }

    public int maxVowels(String s, int k) {
        int result = 0;
        ArrayList<Character> vowels = new ArrayList<>();

        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        for (int i = 0; i < k; i++)
            if (vowels.contains(s.charAt(i)))
                result++;

        int max = result;
        for (int i = k; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i)))
                result++;
            if (vowels.contains(s.charAt(i - k)))
                result--;
            max = Math.max(max, result);
        }
        return max;
    }
}
