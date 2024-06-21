//https://leetcode.com/problems/grumpy-bookstore-owner/description/
package algorithms.medium;

public class GrumpyBookstoreOwner {
    public static void main(String[] args) {
        GrumpyBookstoreOwner grumpy = new GrumpyBookstoreOwner();
        System.out.println(
                "Output:\t" + grumpy.maxSatisfied(new int[]{1, 0, 1, 2, 1, 1, 7, 5}, new int[]{0, 1, 0, 1, 0, 1, 0, 1},
                        3));
        System.out.println(
                "Output:\t" + grumpy.maxSatisfied(new int[]{1}, new int[]{0}, 1));
    }

    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int initial = 0;
        int maxExtra = 0;
        int current = 0;

        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i] == 0)
                initial += customers[i];
            else if (i < minutes)
                current += customers[i];
        }

        maxExtra = current;
        for (int i = minutes; i < customers.length; i++) {
            current += customers[i] * grumpy[i];
            current -= customers[i - minutes] * grumpy[i - minutes];
            maxExtra = Math.max(maxExtra, current);
        }
        return initial + maxExtra;
    }
}
