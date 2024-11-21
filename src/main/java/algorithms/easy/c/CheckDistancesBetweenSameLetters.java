//https://leetcode.com/problems/check-distances-between-same-letters/
package algorithms.easy.c;

public class CheckDistancesBetweenSameLetters {
    public static void main(String[] args) {
        CheckDistancesBetweenSameLetters same = new CheckDistancesBetweenSameLetters();
        System.out.println("Output:\t" + same.checkDistances("abaccb",
                new int[]{1, 3, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
        System.out.println("Output:\t" + same.checkDistances("aa",
                new int[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
    }

    public boolean checkDistances(String s, int[] distance) {
        int[] last = new int[26];

        for (int i = 1; i <= s.length(); i++) {
            int index = s.charAt(i - 1) - 'a';
            if (last[index] > 0 && i - last[index] - 1 != distance[index]) return false;
            last[index] = i;
        }

        return true;
    }
}
