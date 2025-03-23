//https://leetcode.com/problems/incremental-memory-leak/
package algorithms.medium.i;

public class IncrementalMemoryLeak {
    public static void main(String[] args) {
        IncrementalMemoryLeak obj = new IncrementalMemoryLeak();
        System.out.println("Output:\t" + obj.memLeak(2, 2));
        System.out.println("Output:\t" + obj.memLeak(8, 11));
    }

    public int[] memLeak(int memory1, int memory2) {
        int second = 1;

        while (second <= Math.max(memory1, memory2)) {
            if (memory1 >= memory2) memory1 -= second;
            else memory2 -= second;
            second++;
        }

        return new int[]{second, memory1, memory2};
    }
}
