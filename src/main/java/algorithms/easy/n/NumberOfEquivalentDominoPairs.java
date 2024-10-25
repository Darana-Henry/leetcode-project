//https://leetcode.com/problems/number-of-equivalent-domino-pairs/
package algorithms.easy.n;

public class NumberOfEquivalentDominoPairs {
    public static void main(String[] args) {
        NumberOfEquivalentDominoPairs equivalent = new NumberOfEquivalentDominoPairs();
        System.out.println("Output:\t" + equivalent.numEquivDominoPairs(new int[][]{{1, 2}, {2, 1}, {3, 4}, {5, 6}}));
        System.out.println(
                "Output:\t" + equivalent.numEquivDominoPairs(new int[][]{{1, 2}, {1, 2}, {1, 1}, {1, 2}, {2, 2}}));
    }

    public int numEquivDominoPairs(int[][] dominoes) {
        int[] count = new int[100];
        int answer = 0;
        for (int[] dom : dominoes) {
            int max = Math.max(dom[0], dom[1]);
            int min = Math.min(dom[0], dom[1]);
            int norm = min * 10 + max;
            answer += count[norm]++;
        }
        return answer;
    }
}
