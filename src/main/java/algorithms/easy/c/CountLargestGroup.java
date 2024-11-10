//https://leetcode.com/problems/count-largest-group/
package algorithms.easy.c;

public class CountLargestGroup {
    public static void main(String[] args) {
        CountLargestGroup largest = new CountLargestGroup();
        System.out.println("Output:\t" + largest.countLargestGroup(13));
        System.out.println("Output:\t" + largest.countLargestGroup(2));
    }

    public int countLargestGroup(int n) {
        int[] count = new int[40];
        int answer = 0;
        int maxSize = 0;

        for (int i = 1; i <= n; i++) {
            int sum = 0;

            for (int num = i; num > 0; num /= 10)
                sum += num % 10;

            count[sum]++;

            if (maxSize < count[sum]) {
                maxSize = count[sum];
                answer = 1;
            } else if (maxSize == count[sum]) answer++;

        }
        return answer;
    }
}
