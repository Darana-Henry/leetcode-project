//https://leetcode.com/problems/find-the-prefix-common-array-of-two-arrays/
package algorithms.medium.f;

public class FindThePrefixCommonArrayOfTwoArrays {
    public static void main(String[] args) {
        FindThePrefixCommonArrayOfTwoArrays obj = new FindThePrefixCommonArrayOfTwoArrays();
        System.out.println("Output:\t" + obj.findThePrefixCommonArray(new int[]{1, 3, 2, 4}, new int[]{3, 1, 2, 4}));
        System.out.println("Output:\t" + obj.findThePrefixCommonArray(new int[]{2, 3, 1}, new int[]{3, 1, 2}));
    }

    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] counts = new int[A.length + 1];
        int[] answer = new int[A.length];
        int count = 0;

        for (int i = 0; i < A.length; i++) {
            if (++counts[A[i]] == 2) count++;
            if (++counts[B[i]] == 2) count++;
            answer[i] = count;
        }

        return answer;
    }
}
