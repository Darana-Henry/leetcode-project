//https://leetcode.com/problems/find-all-k-distant-indices-in-an-array/
package algorithms.easy.f;

import java.util.ArrayList;
import java.util.List;

public class FindAllKDistantIndicesInAnArray {
    public static void main(String[] args) {
        FindAllKDistantIndicesInAnArray distant = new FindAllKDistantIndicesInAnArray();
        System.out.println("Output:\t" + distant.findKDistantIndices(new int[]{3, 4, 9, 1, 3, 9, 5}, 9, 1));
        System.out.println("Output:\t" + distant.findKDistantIndices(new int[]{2, 2, 2, 2, 2}, 2, 2));
    }

    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int n = nums.length;
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (Math.abs(i - j) <= k && nums[j] == key) {
                    answer.add(i);
                    break;
                }
            }
        }
        return answer;
    }
}
