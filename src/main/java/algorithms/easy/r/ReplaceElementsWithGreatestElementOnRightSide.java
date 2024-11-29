//https://leetcode.com/problems/shuffle-the-array/
package algorithms.easy.r;

public class ReplaceElementsWithGreatestElementOnRightSide {
    public static void main(String[] args) {
        ReplaceElementsWithGreatestElementOnRightSide replace = new ReplaceElementsWithGreatestElementOnRightSide();
        System.out.println("Output:\t" + replace.replaceElements(new int[]{17, 18, 5, 4, 6, 1}));
        System.out.println("Output:\t" + replace.replaceElements(new int[]{400}));
        System.out.println("Output:\t" + replace.replaceElementsOptimized(new int[]{17, 18, 5, 4, 6, 1}));
        System.out.println("Output:\t" + replace.replaceElementsOptimized(new int[]{400}));
    }

    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int max = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > max) {
                int temp = max;
                max = arr[i];
                arr[i] = temp;
            } else arr[i] = max;
        }
        return arr;
    }

    public int[] replaceElementsOptimized(int[] arr) {
        int max = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int curr = arr[i];
            arr[i] = max;
            max = Math.max(max, curr);
        }
        return arr;
    }
}
