//https://leetcode.com/problems/valid-mountain-array/
package algorithms.easy.v;

public class ValidMountainArray {
    public static void main(String[] args) {
        ValidMountainArray mountain = new ValidMountainArray();
        System.out.println("Output:\t" + mountain.validMountainArray(new int[]{2, 1}));
        System.out.println("Output:\t" + mountain.validMountainArray(new int[]{3, 5, 5}));
        System.out.println("Output:\t" + mountain.validMountainArray(new int[]{0, 3, 2, 1}));
    }

    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        if (n < 3) return false;
        int left = 0, right = n - 1;
        while (left + 1 < n - 1 && arr[left] < arr[left + 1]) left++;
        while (right - 1 > 0 && arr[right] < arr[right - 1]) right--;
        return left == right;
    }
}
