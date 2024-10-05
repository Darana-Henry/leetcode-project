//https://leetcode.com/problems/robot-return-to-origin/
package algorithms.easy.r;

import java.util.HashMap;
import java.util.Map;


public class RobotReturnToOrigin {
    public static void main(String[] args) {
        RobotReturnToOrigin origin = new RobotReturnToOrigin();
        System.out.println("Output:\t" + origin.judgeCircle("UD"));
        System.out.println("Output:\t" + origin.judgeCircleOptimized("LL"));
    }

    public boolean judgeCircle(String moves) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('L', -1);
        map.put('R', 1);
        map.put('U', 1);
        map.put('D', -1);
        int x = 0;
        int y = 0;

        for (char ch : moves.toCharArray()) {
            if (ch == 'L' || ch == 'R') x += map.get(ch);
            if (ch == 'U' || ch == 'D') y += map.get(ch);
        }
        return (x == 0 && y == 0);
    }

    public boolean judgeCircleOptimized(String moves) {
        int x = 0;
        int y = 0;

        for (char move : moves.toCharArray()) {
            if (move == 'R') x++;
            else if (move == 'L') x--;
            else if (move == 'U') y++;
            else if (move == 'D') y--;
        }
        return (x == 0 && y == 0);
    }
}
