//https://leetcode.com/problems/element-appearing-more-than-25-in-sorted-array/
package algorithms.easy.e;

public class ElementAppearingMoreThan25InSortedArray {
    public static void main(String[] args) {
        ElementAppearingMoreThan25InSortedArray morethan25 = new ElementAppearingMoreThan25InSortedArray();
        System.out.println("Output:\t" + morethan25.findSpecialInteger(new int[]{1, 2, 2, 6, 6, 6, 6, 7, 10}));
        System.out.println("Output:\t" + morethan25.findSpecialInteger(new int[]{1, 1}));
    }

    public int findSpecialInteger(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++)
            if (arr[i] == arr[i + (n >> 2)]) return arr[i];


        return -1;
    }
}
