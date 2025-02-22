//https://leetcode.com/problems/count-sorted-vowel-strings/
package algorithms.medium.c;

import java.util.Arrays;

public class CountSortedVowelStrings {
    public static void main(String[] args) {
        CountSortedVowelStrings obj = new CountSortedVowelStrings();
        System.out.println("Output:\t" + obj.countVowelStrings(1));
        System.out.println("Output:\t" + obj.countVowelStrings(2));
        System.out.println("Output:\t" + obj.countVowelStrings(33));
    }

    public int countVowelStrings(int n) {
        int[] vowels = new int[]{1, 1, 1, 1, 1};

        for (int i = 0; i < n - 1; i++) {
            int sum = 0;
            for (int j = 0; j < 5; j++) {
                sum += vowels[j];
                vowels[j] = sum;
            }
        }
        return Arrays.stream(vowels).sum();
    }
}
