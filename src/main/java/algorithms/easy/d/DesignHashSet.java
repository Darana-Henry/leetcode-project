//https://leetcode.com/problems/design-hashset/
package algorithms.easy.d;

public class DesignHashSet {
    public static void main(String[] args) {
        MyHashSet hash = new MyHashSet();
        MyHashSet myHashSet = new MyHashSet();
        myHashSet.add(1);      // set = [1]
        myHashSet.add(2);      // set = [1, 2]
        System.out.println("Output:\t" + myHashSet.contains(1));// return True
        System.out.println("Output:\t" + myHashSet.contains(3));// return False, (not found)
        myHashSet.add(2);      // set = [1, 2]
        System.out.println("Output:\t" + myHashSet.contains(2));// return True
        myHashSet.remove(2);   // set = [1]
        System.out.println("Output:\t" + myHashSet.contains(2));// return False, (already removed)
    }
}

class MyHashSet {
    boolean[] data;

    public MyHashSet() {
        data = new boolean[1000001];
    }

    public void add(int key) {
        data[key] = true;
    }

    public void remove(int key) {
        data[key] = false;
    }

    public boolean contains(int key) {
        return data[key];
    }
}