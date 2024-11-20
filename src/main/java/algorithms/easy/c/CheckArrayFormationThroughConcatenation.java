//https://leetcode.com/problems/check-array-formation-through-concatenation/
package algorithms.easy.c;

import java.util.HashMap;
import java.util.Map;

public class CheckArrayFormationThroughConcatenation {
    public static void main(String[] args) {
        CheckArrayFormationThroughConcatenation concat = new CheckArrayFormationThroughConcatenation();
        System.out.println("Output:\t" + concat.canFormArray(new int[]{15, 88}, new int[][]{{88}, {15}}));
        System.out.println("Output:\t" + concat.canFormArray(new int[]{49, 18, 16}, new int[][]{{16, 18, 49}}));
        System.out.println(
                "Output:\t" + concat.canFormArray(new int[]{91, 4, 64, 78}, new int[][]{{78}, {4, 64}, {91}}));
    }

    public boolean canFormArray(int[] arr, int[][] pieces) {
        Map<Integer, int[]> map = new HashMap<>();

        for (int[] piece : pieces)
            map.put(piece[0], piece);

        for (int i = 0; i < arr.length; ) {
            if (!map.containsKey(arr[i])) return false;

            for (int val : map.get(arr[i]))
                if (arr[i++] != val) return false;
        }

        return true;
    }
}
