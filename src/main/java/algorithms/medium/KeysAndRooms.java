//https://leetcode.com/problems/keys-and-rooms/description/
package algorithms.medium;

import java.util.List;
import java.util.Stack;

public class KeysAndRooms {
    public static void main(String[] args) {
        KeysAndRooms keys = new KeysAndRooms();
//        System.out.println("Output:\t" + keys.canVisitAllRooms());
//        System.out.println("Output:\t" + keys.canVisitAllRooms());
    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] seen = new boolean[rooms.size()];
        seen[0] = true;

        Stack<Integer> keys = new Stack<>();
        keys.add(0);

        while (!keys.isEmpty()) {
            int currentKey = keys.pop();
            for (int key : rooms.get(currentKey)) {
                if (!seen[key]) {
                    seen[key] = true;
                    keys.add(key);
                }
            }
        }

        for (boolean visited : seen)
            if (!visited)
                return false;

        return true;

    }
}
