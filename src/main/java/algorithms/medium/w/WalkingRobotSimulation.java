//https://leetcode.com/problems/walking-robot-simulation/
package algorithms.medium.w;

import java.util.Set;
import java.util.HashSet;

public class WalkingRobotSimulation {
    public static void main(String[] args) {
        WalkingRobotSimulation walkingRobotSimulation = new WalkingRobotSimulation();
        System.out.println("Output:\t" + walkingRobotSimulation.robotSim(new int[]{4, -1, 3}, new int[][]{}));
        System.out.println(
                "Output:\t" + walkingRobotSimulation.robotSim(new int[]{4, -1, 4, -2, 4}, new int[][]{{2, 4}}));
        System.out.println("Output:\t" + walkingRobotSimulation.robotSim(new int[]{6, -1, -1, 6}, new int[][]{{0, 0}}));
    }

    public int robotSim(int[] commands, int[][] obstacles) {
        int answer = 0, direction = 0, x = 0, y = 0;
        int[] dir = new int[]{0, 1, 0, -1, 0};
        Set<Integer> obs = new HashSet<>();

        for (int[] ob : obstacles)
            obs.add(encode(ob[0], ob[1]));

        for (int command : commands) {
            if (command == -2) direction = (direction + 3) % 4;
            else if (command == -1) direction = (direction + 1) % 4;
            else {
                while (command-- > 0) {
                    int nextX = x + dir[direction];
                    int nextY = y + dir[direction + 1];
                    if (obs.contains(encode(nextX, nextY))) break;
                    x = nextX;
                    y = nextY;
                    answer = Math.max(answer, x * x + y * y);
                }
            }
        }

        return answer;
    }

    public int encode(int x, int y) {
        return x * 70010 + y;
    }
}
