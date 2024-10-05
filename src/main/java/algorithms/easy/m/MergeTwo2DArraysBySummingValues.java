//https://leetcode.com/problems/merge-two-2d-arrays-by-summing-values/
package algorithms.easy.m;

public class MergeTwo2DArraysBySummingValues {
    public static void main(String[] args) {
        MergeTwo2DArraysBySummingValues merge = new MergeTwo2DArraysBySummingValues();
        System.out.println("Output:\t" + merge.mergeArrays(new int[][]{{1, 2}, {2, 3}, {4, 5}},
                new int[][]{{1, 4}, {3, 2}, {4, 1}}));
        System.out.println(
                "Output:\t" + merge.mergeArrays(new int[][]{{2, 4}, {3, 6}, {5, 5}}, new int[][]{{1, 3}, {4, 3}}));
    }

    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int[] counts = new int[1001];

        for (int[] pair : nums1)
            counts[pair[0]] += pair[1];

        for (int[] pair : nums2)
            counts[pair[0]] += pair[1];

        int size = 0;
        for (int count : counts)
            if (count > 0) size++;

        int[][] merge = new int[size][2];
        for (int i = 0, index = 0; i < counts.length; i++) {
            if (counts[i] > 0) merge[index++] = new int[]{i, counts[i]};
        }
        return merge;
    }
}
