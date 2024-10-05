//https://leetcode.com/problems/duplicate-zeros/
package algorithms.easy.d;

public class DuplicateZeros {
    public static void main(String[] args) {
        DuplicateZeros duplicate = new DuplicateZeros();
        duplicate.duplicateZeros(new int[]{1, 0, 2, 3, 0, 4, 5, 0});
        duplicate.duplicateZeros(new int[]{1, 2, 3});
    }

    public void duplicateZeros(int[] arr) {
        int curr = -1, future = 0, n = arr.length;
        while (future < n) {
            curr++;
            future += (arr[curr] == 0) ? 2 : 1;
        }

        int last = n - 1;
        if (future == n + 1) {
            curr--;
            arr[last--] = 0;
        }

        while (last >= 0) {
            arr[last] = arr[curr];
            if (arr[curr] == 0) arr[--last] = arr[curr];

            curr--;
            last--;
        }
    }
}
