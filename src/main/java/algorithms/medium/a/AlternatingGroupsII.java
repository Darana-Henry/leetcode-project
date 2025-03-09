//https://leetcode.com/problems/alternating-groups-ii/
package algorithms.medium.a;

public class AlternatingGroupsII {
    public static void main(String[] args) {
        AlternatingGroupsII obj = new AlternatingGroupsII();
        System.out.println("Output:\t" + obj.numberOfAlternatingGroups(new int[]{0, 1, 0, 1, 0}, 3));
        System.out.println("Output:\t" + obj.numberOfAlternatingGroups(new int[]{0, 1, 0, 0, 1, 0, 1}, 6));
        System.out.println("Output:\t" + obj.numberOfAlternatingGroups(new int[]{1, 1, 0, 1}, 4));
    }

    public int numberOfAlternatingGroups(int[] colors, int k) {
        int answer = 0, prev = colors[0], alt = 1, n = colors.length;

        for (int i = 1; i < n + k - 1; i++) {
            int index = i % n;

            if (colors[index] == prev) {
                alt = 1;
                prev = colors[index];
                continue;
            }

            alt += 1;
            prev = colors[index];

            if (alt >= k) answer++;
        }

        return answer;
    }
}
