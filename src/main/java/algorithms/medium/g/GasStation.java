//https://leetcode.com/problems/gas-station/description/
package algorithms.medium.g;

public class GasStation {
    public static void main(String[] args) {
        GasStation gas = new GasStation();
        System.out.println("Output:\t" + gas.canCompleteCircuit(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 1, 2}));
        System.out.println("Output:\t" + gas.canCompleteCircuit(new int[]{2, 3, 4}, new int[]{3, 4, 3}));
    }

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum = 0, totalSum = 0, position = 0;
        for (int i = 0; i < gas.length; i++) {
            sum += gas[i] - cost[i];
            if (sum < 0) {
                totalSum += sum;
                sum = 0;
                position = i + 1;
            }
        }
        totalSum += sum;
        return totalSum >= 0 ? position : -1;
    }
}
