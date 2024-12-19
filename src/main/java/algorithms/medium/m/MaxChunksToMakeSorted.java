//https://leetcode.com/problems/max-chunks-to-make-sorted/
package algorithms.medium.m;

public class MaxChunksToMakeSorted {
    public static void main(String[] args) {
        MaxChunksToMakeSorted obj = new MaxChunksToMakeSorted();
        System.out.println("Output:\t" + obj.maxChunksToSorted(new int[]{4, 3, 2, 1, 0}));
        System.out.println("Output:\t" + obj.maxChunksToSorted(new int[]{1, 0, 2, 3, 4}));
    }

    public int maxChunksToSorted(int[] arr) {
        int answer = 0, max = 0;

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            if (max == i) answer++;
        }

        return answer;
    }
}
