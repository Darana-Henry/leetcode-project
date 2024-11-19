//https://leetcode.com/problems/path-crossing/
package algorithms.easy.p;

import java.util.HashSet;
import java.util.Set;

public class PathCrossing {
    public static void main(String[] args) {
        PathCrossing crossing = new PathCrossing();
        System.out.println("Output:\t" + crossing.isPathCrossing("NES"));
        System.out.println("Output:\t" + crossing.isPathCrossing("NESWW"));
    }

    public boolean isPathCrossing(String path) {
        int x = 0, y = 0;

        Set<Integer> visited = new HashSet<>();
        visited.add(0);

        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            switch (dir) {
                case 'N':
                    y--;
                    break;
                case 'S':
                    y++;
                    break;
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
                    break;
            }

            int hash = y * 200000 + x;

            if (!visited.add(hash)) return true;
        }

        return false;
    }
}
