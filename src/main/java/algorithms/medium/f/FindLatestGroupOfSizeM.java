//https://leetcode.com/problems/find-latest-group-of-size-m/
package algorithms.medium.f;

public class FindLatestGroupOfSizeM {
    public static void main(String[] args) {
        FindLatestGroupOfSizeM obj = new FindLatestGroupOfSizeM();
        System.out.println("Output:\t" + obj.findLatestStep(new int[]{3, 5, 1, 2, 4}, 1));
        System.out.println("Output:\t" + obj.findLatestStep(new int[]{3, 1, 5, 4, 2}, 2));
    }

    public int findLatestStep(int[] arr, int m) {
        int answer = -1, n = arr.length;
        if (n == m) return n;
        int[] count = new int[n + 2];

        for (int i = 0; i < n; i++) {
            int a = arr[i], left = count[a - 1], right = count[a + 1];
            count[a - left] = count[a + right] = left + right + 1;
            if (left == m || right == m) answer = i;
        }

        return answer;
    }
}
