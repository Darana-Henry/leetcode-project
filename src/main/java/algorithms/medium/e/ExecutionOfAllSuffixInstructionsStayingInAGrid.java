//https://leetcode.com/problems/execution-of-all-suffix-instructions-staying-in-a-grid/
package algorithms.medium.e;

import java.util.HashMap;
import java.util.Map;

public class ExecutionOfAllSuffixInstructionsStayingInAGrid {
    public static void main(String[] args) {
        ExecutionOfAllSuffixInstructionsStayingInAGrid obj = new ExecutionOfAllSuffixInstructionsStayingInAGrid();
        System.out.println("Output:\t" + obj.executeInstructions(3, new int[]{0, 1}, "RRDDLU"));
        System.out.println("Output:\t" + obj.executeInstructions(2, new int[]{1, 1}, "LURD"));
        System.out.println("Output:\t" + obj.executeInstructions(1, new int[]{0, 0}, "LRUD"));
    }

    public int[] executeInstructions(int n, int[] startPos, String s) {
        int len = s.length();
        int[] answer = new int[len];
        Map<Character, int[]> map = new HashMap<>();
        map.put('L', new int[]{0, -1});
        map.put('R', new int[]{0, 1});
        map.put('U', new int[]{-1, 0});
        map.put('D', new int[]{1, 0});

        for (int i = 0; i < len; i++) {
            int row = startPos[0];
            int col = startPos[1];
            int moves = 0;
            for (int j = i; j < len; j++) {
                char ch = s.charAt(j);
                int[] dir = map.get(ch);
                row += dir[0];
                col += dir[1];
                if (row >= 0 && row < n && col >= 0 && col < n) moves++;
                else break;
            }
            answer[i] = moves;
        }
        return answer;
    }
}
