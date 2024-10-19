//https://leetcode.com/problems/partition-array-into-three-parts-with-equal-sum/
package algorithms.easy.p;

public class PartitionArrayIntoThreePartsWithEqualSum {
    public static void main(String[] args) {
        PartitionArrayIntoThreePartsWithEqualSum partition = new PartitionArrayIntoThreePartsWithEqualSum();
        System.out.println("Output:\t" + partition.canThreePartsEqualSum(new int[]{0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1}));
        System.out.println("Output:\t" + partition.canThreePartsEqualSum(new int[]{0, 2, 1, -6, 6, 7, 9, -1, 2, 0, 1}));
        System.out.println("Output:\t" + partition.canThreePartsEqualSum(new int[]{3, 3, 6, 5, -2, 2, 5, 1, -9, 4}));
    }

    public boolean canThreePartsEqualSum(int[] arr) {
        int total = 0;

        for (int num : arr)
            total += num;

        if (total % 3 != 0) return false;
        int left = 0, right = arr.length - 1;
        int lSum = 0, rSum = 0;

        while (left < arr.length) {
            lSum += arr[left];
            if (lSum == total / 3) break;
            left++;
        }

        while (right > 0) {
            rSum += arr[right];
            if (rSum == total / 3) break;
            right--;
        }

        return left < right - 1;
    }
}
