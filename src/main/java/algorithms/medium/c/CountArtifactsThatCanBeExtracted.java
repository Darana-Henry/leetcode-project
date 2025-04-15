//https://leetcode.com/problems/count-artifacts-that-can-be-extracted/
package algorithms.medium.c;

import java.util.HashSet;
import java.util.Set;

public class CountArtifactsThatCanBeExtracted {

    public static void main(String[] args) {
        CountArtifactsThatCanBeExtracted obj = new CountArtifactsThatCanBeExtracted();
        System.out.println("Output:\t" + obj.digArtifacts(2, new int[][]{{0, 0, 0, 0}, {0, 1, 1, 1}},
                new int[][]{{0, 0}, {0, 1}}));
        System.out.println("Output:\t" + obj.digArtifacts(2, new int[][]{{0, 0, 0, 0}, {0, 1, 1, 1}},
                new int[][]{{0, 0}, {0, 1}, {1, 1}}));
    }


    public int digArtifacts(int n, int[][] artifacts, int[][] dig) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();

        for (int[] d : dig)
            set.add(d[0] * n + d[1]);

        for (int[] a : artifacts)
            if (isOut(a, set, n)) answer++;

        return answer;
    }

    public boolean isOut(int[] a, Set set, int n) {
        int tR = a[0], tC = a[1], bR = a[2], bC = a[3];

        for (int row = tR; row <= bR; row++)
            for (int col = tC; col <= bC; col++)
                if (!set.contains(row * n + col)) return false;

        return true;
    }
}
