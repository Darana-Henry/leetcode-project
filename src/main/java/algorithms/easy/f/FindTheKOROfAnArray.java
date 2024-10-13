//https://leetcode.com/problems/find-the-k-or-of-an-array/
package algorithms.easy.f;

public class FindTheKOROfAnArray {
    public static void main(String[] args) {
        FindTheKOROfAnArray kor = new FindTheKOROfAnArray();
        System.out.println("Output:\t" + kor.findKOr(new int[]{7, 12, 9, 8, 9, 15}, 4));
        System.out.println("Output:\t" + kor.findKOr(new int[]{2, 12, 1, 11, 4, 5}, 6));
        System.out.println("Output:\t" + kor.findKOr(new int[]{10, 8, 5, 9, 11, 6, 8}, 1));
    }

    public int findKOr(int[] nums, int k) {
        int answer = 0;

        for (int i = 0; i < 32; i++) {
            int count = 0;

            for (int num : nums)
                count += (num >> i) & 1;

            if (count >= k) answer |= 1 << i;
        }

        return answer;
    }
}
