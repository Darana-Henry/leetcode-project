//https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks/
package algorithms.easy.m;

public class MinimumRecolorsToGetKConsecutiveBlackBlocks {
    public static void main(String[] args) {
        MinimumRecolorsToGetKConsecutiveBlackBlocks recolors = new MinimumRecolorsToGetKConsecutiveBlackBlocks();
        System.out.println("Output:\t" + recolors.minimumRecolors("WBBWWBBWBW", 7));
        System.out.println("Output:\t" + recolors.minimumRecolors("WBWBBBW", 2));
    }

    public int minimumRecolors(String blocks, int k) {
        int whites = 0;
        for (int i = 0; i < k; i++)
            if (blocks.charAt(i) == 'W') whites++;

        int answer = whites;
        for (int i = k; i < blocks.length(); i++) {
            if (blocks.charAt(i) == 'W') whites++;
            if (blocks.charAt(i - k) == 'W') whites--;

            answer = Math.min(answer, whites);
        }
        return answer;
    }
}
