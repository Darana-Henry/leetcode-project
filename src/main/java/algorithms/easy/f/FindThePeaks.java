//https://leetcode.com/problems/find-the-peaks/
package algorithms.easy.f;

import java.util.ArrayList;
import java.util.List;

public class FindThePeaks {
    public static void main(String[] args) {
        FindThePeaks peaks = new FindThePeaks();
        System.out.println("Output:\t" + peaks.findPeaks(new int[]{2, 4, 4}));
        System.out.println("Output:\t" + peaks.findPeaks(new int[]{1, 4, 3, 8, 5}));
    }

    public List<Integer> findPeaks(int[] mountain) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 1; i < mountain.length - 1; i++)
            if (mountain[i] > mountain[i - 1] && mountain[i] > mountain[i + 1]) answer.add(i);

        return answer;
    }
}
