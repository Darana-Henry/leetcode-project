//https://leetcode.com/problems/robot-bounded-in-circle/
package algorithms.medium.r;

public class RobotBoundedInCircle {
    public static void main(String[] args) {
        RobotBoundedInCircle obj = new RobotBoundedInCircle();
        System.out.println("Output:\t" + obj.isRobotBounded("GGLLGG"));
        System.out.println("Output:\t" + obj.isRobotBounded("GG"));
        System.out.println("Output:\t" + obj.isRobotBounded("GL"));
    }

    public boolean isRobotBounded(String instructions) {
        int direction = 0;
        int[] dir = new int[4];

        for (char ch : instructions.toCharArray()) {
            if (ch == 'L') direction = (direction + 1) % 4;
            else if (ch == 'R') direction = (direction + 3) % 4;
            else dir[direction]++;
        }

        return (dir[0] == dir[2] && dir[1] == dir[3]) || (direction != 0);
    }
}
