//https://leetcode.com/problems/decompress-run-length-encoded-list/
package algorithms.easy.d;

import java.util.List;
import java.util.ArrayList;

public class DecompressRunLengthEncodedList {
    public static void main(String[] args) {
        DecompressRunLengthEncodedList decompress = new DecompressRunLengthEncodedList();
        System.out.println("Output:\t" + decompress.decompressRLElistOptmizied(new int[]{1, 2, 3, 4}));
        System.out.println("Output:\t" + decompress.decompressRLElistOptmizied(new int[]{1, 1, 2, 3}));
        System.out.println("Output:\t" + decompress.decompressRLElistOptmizied(new int[]{1, 2, 3, 4}));
        System.out.println("Output:\t" + decompress.decompressRLElistOptmizied(new int[]{1, 1, 2, 3}));
    }

    public int[] decompressRLElistOptmizied(int[] nums) {
        int len = 0;

        for (int i = 0; i < nums.length; i += 2)
            len += nums[i];

        int index = 0;
        int[] answer = new int[len];

        for (int i = 1; i < nums.length; i += 2)
            for (int j = 0; j < nums[i - 1]; j++)
                answer[index++] = nums[i];

        return answer;
    }

    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length - 1; i += 2) {
            for (int j = 1; j <= nums[i]; j++)
                list.add(nums[i + 1]);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
