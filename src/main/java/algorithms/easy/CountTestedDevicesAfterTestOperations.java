//https://leetcode.com/problems/count-tested-devices-after-test-operations/
package algorithms.easy;

public class CountTestedDevicesAfterTestOperations {
    public static void main(String[] args) {
        CountTestedDevicesAfterTestOperations tested = new CountTestedDevicesAfterTestOperations();
        System.out.println("Output:\t" + tested.countTestedDevices(new int[]{1, 1, 2, 1, 3}));
        System.out.println("Output:\t" + tested.countTestedDevices(new int[]{0, 1, 2}));
        System.out.println("Output:\t" + tested.countTestedDevicesOptimized(new int[]{1, 1, 2, 1, 3}));
        System.out.println("Output:\t" + tested.countTestedDevicesOptimized(new int[]{0, 1, 2}));
    }

    public int countTestedDevices(int[] batteryPercentages) {
        int tested = 0;
        int index = 0;
        int n = batteryPercentages.length;
        while (index < n) {
            if (batteryPercentages[index] != 0) {
                tested++;
                for (int j = index + 1; j < n; j++)
                    batteryPercentages[j] = Math.max(0, batteryPercentages[j] - 1);
            }
            index++;
        }
        return tested;
    }

    public int countTestedDevicesOptimized(int[] batteryPercentages) {
        int tested = 0;

        for (int battery : batteryPercentages)
            tested += battery > tested ? 1 : 0;

        return tested;
    }
}
