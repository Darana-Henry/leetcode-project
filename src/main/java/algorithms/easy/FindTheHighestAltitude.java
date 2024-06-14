//https://leetcode.com/problems/find-the-highest-altitude/description/
package algorithms.easy;

public class FindTheHighestAltitude {
    public static void main(String[] args) {
        FindTheHighestAltitude altitude = new FindTheHighestAltitude();
        System.out.println("Output:\t" + altitude.largestAltitude(new int[]{-5, 1, 5, 0, -7}));
        System.out.println("Output:\t" + altitude.largestAltitude(new int[]{-4, -3, -2, -1, 4, 3, 2}));
    }

    public int largestAltitude(int[] gain) {
        int max = 0;
        int runningSum = 0;

        for (int i : gain) {
            runningSum += i;
            max = Math.max(runningSum, max);
        }
        return max;
    }
}
