//https://leetcode.com/problems/design-hashmap/
package algorithms.easy.d;

import java.util.Arrays;

public class DesignHashMap {
    public static void main(String[] args) {
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put(1, 1); // The map is now [[1,1]]
        myHashMap.put(2, 2); // The map is now [[1,1], [2,2]]
        System.out.println("Output:\t" + myHashMap.get(1));    // return 1, The map is now [[1,1], [2,2]]
        System.out.println(
                "Output:\t" + myHashMap.get(3));    // return -1 (i.e., not found), The map is now [[1,1], [2,2]]
        myHashMap.put(2, 1); // The map is now [[1,1], [2,1]] (i.e., update the existing value)
        System.out.println("Output:\t" + myHashMap.get(2));    // return 1, The map is now [[1,1], [2,1]]
        myHashMap.remove(2); // remove the mapping for 2, The map is now [[1,1]]
        System.out.println("Output:\t" + myHashMap.get(2));    // return -1 (i.e., not found), The map is now [[1,1]]
    }

}

class MyHashMap {
    int[] data;

    public MyHashMap() {
        data = new int[1000001];
        Arrays.fill(data, -1);
    }

    public void put(int key, int value) {
        data[key] = value;
    }

    public int get(int key) {
        return data[key];
    }

    public void remove(int key) {
        data[key] = -1;
    }
}