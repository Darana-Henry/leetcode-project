//https://leetcode.com/problems/sum-of-all-subset-xor-totals/
package algorithms.easy.s;

public class SumOfAllSubsetXORTotals {
    int[] elements;

    public static void main(String[] args) {
        SumOfAllSubsetXORTotals total = new SumOfAllSubsetXORTotals();
        System.out.println("Output:\t" + total.subsetXORSum(new int[]{1, 3}));
        System.out.println("Output:\t" + total.subsetXORSum(new int[]{5, 1, 6}));
        System.out.println("Output:\t" + total.subsetXORSum(new int[]{3, 4, 5, 6, 7, 8}));
    }

    public int subsetXORSum(int[] nums) {
        this.elements = nums;
        return backtrack(0, 0);
    }

    public int backtrack(int index, int curr) {
        if (index == elements.length) return curr;

        int withEle = backtrack(index + 1, curr ^ elements[index]);
        int withoutEle = backtrack(index + 1, curr);
        return withEle + withoutEle;
    }
}
