//https://leetcode.com/problems/group-the-people-given-the-group-size-they-belong-to/
package algorithms.medium.g;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class GroupThePeopleGivenTheGroupSizeTheyBelongTo {
    public static void main(String[] args) {
        GroupThePeopleGivenTheGroupSizeTheyBelongTo obj = new GroupThePeopleGivenTheGroupSizeTheyBelongTo();
        System.out.println("Output:\t" + obj.groupThePeople(new int[]{3, 3, 3, 3, 3, 1, 3}));
        System.out.println("Output:\t" + obj.groupThePeople(new int[]{2, 1, 3, 3, 3, 2}));
    }

    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        int n = groupSizes.length;
        List<Integer>[] groups = new List[n + 1];
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.setAll(groups, k -> new ArrayList<>());

        for (int i = 0; i < n; i++)
            groups[groupSizes[i]].add(i);

        for (int i = 0; i < groups.length; i++) {
            List<Integer> curr = groups[i];
            for (int j = 0; j < curr.size(); j += i)
                answer.add(curr.subList(j, j + i));
        }

        return answer;
    }
}
