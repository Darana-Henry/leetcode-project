//https://leetcode.com/problems/letter-tile-possibilities/
package algorithms.medium.l;

public class LetterTilePossibilities {
    public static void main(String[] args) {
        LetterTilePossibilities obj = new LetterTilePossibilities();
        System.out.println("Output:\t" + obj.numTilePossibilities("AAB"));
        System.out.println("Output:\t" + obj.numTilePossibilities("AAABBC"));
        System.out.println("Output:\t" + obj.numTilePossibilities("V"));
    }

    public int numTilePossibilities(String tiles) {
        int[] counts = new int[26];

        for (char ch : tiles.toCharArray())
            counts[ch - 'A']++;

        return dfs(counts);
    }

    public int dfs(int[] counts) {
        int sum = 0;

        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                sum++;
                counts[i]--;
                sum += dfs(counts);
                counts[i]++;
            }
        }

        return sum;
    }
}
