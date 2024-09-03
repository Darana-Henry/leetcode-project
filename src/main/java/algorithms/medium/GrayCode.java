//https://leetcode.com/problems/gray-code/
package algorithms.medium;

import java.util.ArrayList;
import java.util.List;

public class GrayCode {
    public static void main(String[] args) {
        GrayCode gc = new GrayCode();
        System.out.println("Output:\t" + gc.grayCode(2));
        System.out.println("Output:\t" + gc.grayCode(3));
    }

    public List<Integer> grayCode(int n) {
        List<Integer> grayCodes = new ArrayList<>();
        int totalNums = 1 << n;
        for (int i = 0; i < totalNums; i++) {
            int gcNum = i ^ (i >> 1);
            grayCodes.add(gcNum);
        }
        return grayCodes;
    }
}
