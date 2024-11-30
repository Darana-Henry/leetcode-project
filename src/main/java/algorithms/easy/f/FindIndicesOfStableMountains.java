//https://leetcode.com/problems/find-indices-of-stable-mountains/
package algorithms.easy.f;

import java.util.ArrayList;
import java.util.List;

public class FindIndicesOfStableMountains {
    public static void main(String[] args) {
        FindIndicesOfStableMountains mountains = new FindIndicesOfStableMountains();
        System.out.println("Output:\t" + mountains.stableMountains(new int[]{1, 2, 3, 4, 5}, 2));
        System.out.println("Output:\t" + mountains.stableMountains(new int[]{10, 1, 10, 1, 10}, 3));
        System.out.println("Output:\t" + mountains.stableMountains(new int[]{10, 1, 10, 1, 10}, 10));
    }

    public List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < height.length - 1; i++)
            if (height[i] > threshold) answer.add(i + 1);

        return answer;
    }
}
