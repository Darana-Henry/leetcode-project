//https://leetcode.com/problems/smallest-number-in-infinite-set/description/
package algorithms.medium;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class SmallestNumberInInfiniteSet {
    public static void main(String[] args) {
        SmallestInfiniteSet smallestInfiniteSet = new SmallestInfiniteSet();
        smallestInfiniteSet.addBack(2);
        System.out.println("Output:\t" + smallestInfiniteSet.popSmallest());
        System.out.println("Output:\t" + smallestInfiniteSet.popSmallest());
        System.out.println("Output:\t" + smallestInfiniteSet.popSmallest());
        smallestInfiniteSet.addBack(1);
        System.out.println("Output:\t" + smallestInfiniteSet.popSmallest());
        System.out.println("Output:\t" + smallestInfiniteSet.popSmallest());
        System.out.println("Output:\t" + smallestInfiniteSet.popSmallest());
    }
}

class SmallestInfiniteSet {
    Set<Integer> set;
    PriorityQueue<Integer> q;

    public SmallestInfiniteSet() {
        set = new HashSet<>();
        q = new PriorityQueue<>();
        for (int i = 1; i <= 1000; i++) {
            q.add(i);
            set.add(i);
        }
    }

    public int popSmallest() {
        int num = q.poll();
        set.remove(num);
        return num;
    }

    public void addBack(int num) {
        if (!set.contains(num)) {
            q.add(num);
            set.add(num);
        }
    }
}