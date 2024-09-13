//https://leetcode.com/problems/xor-queries-of-a-subarray/
package algorithms.medium;

public class XORQueriesOfASubarray {
    public static void main(String[] args) {
        XORQueriesOfASubarray queries = new XORQueriesOfASubarray();
        System.out.println(
                "Output:\t" + queries.xorQueries(new int[]{1, 3, 4, 8}, new int[][]{{0, 1}, {1, 2}, {0, 3}, {3, 3}}));
        System.out.println(
                "Output:\t" + queries.xorQueries(new int[]{4, 8, 2, 10}, new int[][]{{2, 3}, {1, 3}, {0, 0}, {0, 3}}));
        System.out.println("Output:\t" + queries.xorQueriesOptimized(new int[]{1, 3, 4, 8},
                new int[][]{{0, 1}, {1, 2}, {0, 3}, {3, 3}}));
        System.out.println("Output:\t" + queries.xorQueriesOptimized(new int[]{4, 8, 2, 10},
                new int[][]{{2, 3}, {1, 3}, {0, 0}, {0, 3}}));
    }

    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] xor = new int[queries.length];
        int index = 0;
        for (int[] query : queries) {
            int left = query[0];
            int right = query[1];
            int prefixSum = arr[left];
            for (int i = left + 1; i <= right; i++) {
                prefixSum ^= arr[i];
            }
            xor[index++] = prefixSum;
        }
        return xor;
    }

    public int[] xorQueriesOptimized(int[] arr, int[][] queries) {
        int n = arr.length;
        int[] xor = new int[n];
        xor[0] = arr[0];

        for (int i = 1; i < n; i++)
            xor[i] = xor[i - 1] ^ arr[i];

        int size = queries.length;
        int[] res = new int[size];

        for (int i = 0; i < size; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            if (start == 0) res[i] = xor[end];
            else res[i] = xor[end] ^ xor[start - 1];
        }
        return res;
    }
}
