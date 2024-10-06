//https://leetcode.com/problems/alternating-groups-i/
package algorithms.easy.a;

public class AlternatingGroupsI {
    public static void main(String[] args) {
        AlternatingGroupsI alternate = new AlternatingGroupsI();
        System.out.println("Output:\t" + alternate.numberOfAlternatingGroups(new int[]{1, 1, 1}));
        System.out.println("Output:\t" + alternate.numberOfAlternatingGroups(new int[]{0, 1, 0, 0, 1}));
    }

    public int numberOfAlternatingGroups(int[] colors) {
        int n = colors.length;
        int answer = 0;

        for (int i = 0; i < n; i++)
            if (colors[i] != colors[(i + 1) % n] && colors[i] != colors[(i - 1 + n) % n]) answer++;

        return answer;
    }
}
