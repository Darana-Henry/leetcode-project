//https://leetcode.com/problems/last-moment-before-all-ants-fall-out-of-a-plank/
package algorithms.medium.l;

public class LastMomentBeforeAllAntsFallOutOfAPlank {
    public static void main(String[] args) {
        LastMomentBeforeAllAntsFallOutOfAPlank obj = new LastMomentBeforeAllAntsFallOutOfAPlank();
        System.out.println("Output:\t" + obj.getLastMoment(4, new int[]{4, 3}, new int[]{0, 1}));
        System.out.println("Output:\t" + obj.getLastMoment(7, new int[]{}, new int[]{0, 1, 2, 3, 4, 5, 6, 7}));
        System.out.println("Output:\t" + obj.getLastMoment(7, new int[]{0, 1, 2, 3, 4, 5, 6, 7}, new int[]{}));
    }

    public int getLastMoment(int n, int[] left, int[] right) {
        int answer = 0;

        for (int num : left)
            answer = Math.max(answer, num);

        for (int num : right)
            answer = Math.max(answer, num);

        return answer;
    }
}
