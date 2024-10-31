//https://leetcode.com/problems/count-elements-with-maximum-frequency/
package algorithms.easy.c;

public class CountElementsWithMaximumFrequency {
    public static void main(String[] args) {
        CountElementsWithMaximumFrequency frequency = new CountElementsWithMaximumFrequency();
        System.out.println("Output:\t" + frequency.maxFrequencyElements(new int[]{1, 2, 2, 3, 1, 4}));
        System.out.println("Output:\t" + frequency.maxFrequencyElements(new int[]{1, 2, 3, 4, 5}));
    }

    public int maxFrequencyElements(int[] nums) {
        int answer = 0;
        int max = -1;
        int[] count = new int[101];

        for (int num : nums)
            count[num]++;

        for (int c : count) {
            if (max < c) {
                max = c;
                answer = c;
            } else if (max == c) answer += c;
        }

        return answer;
    }
}
