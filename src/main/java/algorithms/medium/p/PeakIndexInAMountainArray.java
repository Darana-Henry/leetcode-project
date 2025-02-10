//https://leetcode.com/problems/peak-index-in-a-mountain-array/
package algorithms.medium.p;


public class PeakIndexInAMountainArray {
    public static void main(String[] args) {
        PeakIndexInAMountainArray obj = new PeakIndexInAMountainArray();
        System.out.println("Output:\t" + obj.peakIndexInMountainArray(new int[]{0, 1, 0}));
        System.out.println("Output:\t" + obj.peakIndexInMountainArray(new int[]{0, 2, 1, 0}));
        System.out.println("Output:\t" + obj.peakIndexInMountainArray(new int[]{0, 10, 5, 2}));
    }

    public int peakIndexInMountainArray(int[] arr) {
        int l = 1, r = arr.length - 2;

        while (l < r) {
            int m = l + (r - l) / 2;
            if (arr[m] < arr[m + 1]) l = m + 1;
            else r = m;
        }

        return l;
    }
}
