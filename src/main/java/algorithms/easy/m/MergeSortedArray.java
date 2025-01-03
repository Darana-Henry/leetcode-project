package algorithms.easy.m;

public class MergeSortedArray {

    public static void main(String[] args) {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();

        int[] one = new int[]{1, 2, 3, 0, 0, 0};
        int[] two = new int[]{2, 5, 6};
        int m = 3;
        int n = 3;
        mergeSortedArray.merge(one, m, two, n);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = m + n - 1;
        int p1 = m - 1;
        int p2 = n - 1;

        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }

        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
    }
}
