//https://leetcode.com/problems/find-lucky-integer-in-an-array/
package algorithms.easy.f;

public class FindLuckyIntegerInAnArray {
    public static void main(String[] args) {
        FindLuckyIntegerInAnArray lucky = new FindLuckyIntegerInAnArray();
        System.out.println("Output:\t" + lucky.findLucky(new int[]{2, 2, 3, 4}));
        System.out.println("Output:\t" + lucky.findLucky(new int[]{1, 2, 2, 3, 3, 3}));
        System.out.println("Output:\t" + lucky.findLucky(new int[]{2, 2, 2, 3, 3}));
    }

    public int findLucky(int[] arr) {
        int answer = -1;
        int[] count = new int[501];

        for (int num : arr)
            count[num]++;

        for (int i = 1; i < count.length; i++)
            if (count[i] == i) answer = i;

        return answer;
    }
}
