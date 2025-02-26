//https://leetcode.com/problems/assign-elements-to-groups-with-constraints/
package algorithms.medium.a;

import java.util.Arrays;

public class AssignElementsToGroupsWithConstraints {
    public static void main(String[] args) {
        AssignElementsToGroupsWithConstraints obj = new AssignElementsToGroupsWithConstraints();
        System.out.println("Output:\t" + obj.assignElements(new int[]{8, 4, 3, 2, 4}, new int[]{4, 2}));
        System.out.println("Output:\t" + obj.assignElements(new int[]{2, 3, 5, 7}, new int[]{5, 3, 3}));
        System.out.println("Output:\t" + obj.assignElements(new int[]{10, 21, 30, 41}, new int[]{2, 1}));
    }

    public int[] assignElements(int[] groups, int[] elements) {
        int n = groups.length;
        int[] assigned = new int[n];
        Arrays.fill(assigned, -1);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < elements.length; j++) {
                if (groups[i] % elements[j] == 0) {
                    assigned[i] = j;
                    break;
                }
            }
        }

        return assigned;
    }
}
