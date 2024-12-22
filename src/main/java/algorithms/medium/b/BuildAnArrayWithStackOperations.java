//https://leetcode.com/problems/build-an-array-with-stack-operations/
package algorithms.medium.b;

import java.util.ArrayList;
import java.util.List;

public class BuildAnArrayWithStackOperations {
    public static void main(String[] args) {
        BuildAnArrayWithStackOperations obj = new BuildAnArrayWithStackOperations();
        System.out.println("Output:\t" + obj.buildArray(new int[]{1, 3}, 3));
        System.out.println("Output:\t" + obj.buildArray(new int[]{1, 2, 3}, 3));
        System.out.println("Output:\t" + obj.buildArray(new int[]{1, 2}, 4));
    }

    public List<String> buildArray(int[] target, int n) {
        int curr = 0;
        List<String> answer = new ArrayList<>();

        for (int num : target) {
            while (++curr < num) {
                answer.add("Push");
                answer.add("Pop");
            }
            answer.add("Push");
        }

        return answer;
    }
}
