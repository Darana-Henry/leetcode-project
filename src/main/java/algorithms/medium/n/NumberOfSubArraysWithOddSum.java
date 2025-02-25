//https://leetcode.com/problems/number-of-sub-arrays-with-odd-sum/
package algorithms.medium.n;

public class NumberOfSubArraysWithOddSum {
    public static void main(String[] args) {
        NumberOfSubArraysWithOddSum obj = new NumberOfSubArraysWithOddSum();
        System.out.println("Output:\t" + obj.numOfSubArrays(new int[]{1, 3, 5}));
        System.out.println("Output:\t" + obj.numOfSubArrays(new int[]{2, 4, 6}));
        System.out.println("Output:\t" + obj.numOfSubArrays(new int[]{1, 2, 3, 4, 5, 6, 7}));
    }

    public int numOfSubArrays(int[] arr) {
        int answer = 0, even = 1, odd = 0, sum = 0, MOD = 1000000007;

        for (int num : arr) {
            sum += num;
            if (sum % 2 == 0) {
                answer += odd;
                even++;
            } else {
                answer += even;
                odd++;
            }
            answer %= MOD;
        }

        return answer;
    }
}
