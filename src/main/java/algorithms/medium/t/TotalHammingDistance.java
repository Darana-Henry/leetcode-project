//https://leetcode.com/problems/total-hamming-distance/
package algorithms.medium.t;

public class TotalHammingDistance {
    public static void main(String[] args) {
        TotalHammingDistance obj = new TotalHammingDistance();
        System.out.println("Output:\t" + obj.totalHammingDistance(new int[]{4, 14, 2}));
        System.out.println("Output:\t" + obj.totalHammingDistance(new int[]{4, 14, 4}));
    }

    public int totalHammingDistance(int[] nums) {
        int answer = 0;

        for (int i = 0; i < 31; i++) {
            int ze = 0, on = 0;

            for (int num : nums) {
                if (((num >> i) & 1) == 1) on++;
                else ze++;
            }

            answer += on * ze;
        }

        return answer;
    }
}
