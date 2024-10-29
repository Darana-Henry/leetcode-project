//https://leetcode.com/problems/insert-delete-getrandom-o1/description/
package algorithms.medium.i;

import java.util.ArrayList;
import java.util.HashMap;

public class InsertDeleteGetRandom {
    public static void main(String[] args) {
        RandomizedSet obj = new RandomizedSet();
        boolean param1 = obj.insert(1);
        boolean param2 = obj.remove(2);
        int param3 = obj.getRandom();
    }
}

class RandomizedSet {
    ArrayList<Integer> list = null;
    HashMap<Integer, Integer> map = null;
    java.util.Random random = new java.util.Random();

    public RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
    }

    public boolean insert(int val) {
        if (map.containsKey(val)) return false;

        map.put(val, list.size());
        list.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (map.containsKey(val)) {
            int index = map.get(val);
            if (index < list.size() - 1) {
                int last = list.get(list.size() - 1);
                list.set(index, last);
                map.put(last, index);
            }
            map.remove(val);
            list.remove(list.size() - 1);
            return true;
        }
        return false;
    }

    public int getRandom() {
        return list.get(random.nextInt(list.size()));

    }
}
