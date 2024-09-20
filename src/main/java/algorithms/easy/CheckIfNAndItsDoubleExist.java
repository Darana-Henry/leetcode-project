//https://leetcode.com/problems/check-if-n-and-its-double-exist/
package algorithms.easy;

import java.util.HashMap;
import java.util.Map;

public class CheckIfNAndItsDoubleExist {
    public static void main(String[] args) {
        CheckIfNAndItsDoubleExist check = new CheckIfNAndItsDoubleExist();
        System.out.println("Output:\t" + check.checkIfExist(new int[]{10, 2, 5, 3}));
        System.out.println("Output:\t" + check.checkIfExist(new int[]{3, 1, 7, 11}));
    }

    public boolean checkIfExist(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++)
            map.put(arr[i], i);
        for (int i = 0; i < arr.length; i++) {
            int search = arr[i] * 2;
            if (map.containsKey(search) && map.get(search) != i) return true;
        }
        return false;
    }
}
