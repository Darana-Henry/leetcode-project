//https://leetcode.com/problems/find-common-elements-between-two-arrays/
package algorithms.easy.f;

public class FindCommonElementsBetweenTwoArrays {
    public static void main(String[] args) {
        FindCommonElementsBetweenTwoArrays common = new FindCommonElementsBetweenTwoArrays();
        System.out.println("Output:\t" + common.findIntersectionValues(new int[]{2, 3, 2}, new int[]{1, 2}));
        System.out.println(
                "Output:\t" + common.findIntersectionValues(new int[]{4, 3, 2, 3, 1}, new int[]{2, 2, 5, 2, 3, 6}));
        System.out.println("Output:\t" + common.findIntersectionValues(new int[]{3, 4, 2, 3}, new int[]{1, 5}));
    }

    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] count1 = new int[101];
        int[] count2 = new int[101];
        int[] answer = new int[2];

        for (int num : nums1)
            count1[num] = 1;

        for (int num : nums2)
            count2[num] = 1;

        for (int num : nums1)
            answer[0] += count2[num];

        for (int num : nums2)
            answer[1] += count1[num];

        return answer;
    }
}
