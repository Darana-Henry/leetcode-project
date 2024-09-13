//https://leetcode.com/problems/total-distance-traveled/
package algorithms.easy;

public class TotalDistanceTraveled {
    public static void main(String[] args) {
        TotalDistanceTraveled traveled = new TotalDistanceTraveled();
        System.out.println("Output:\t" + traveled.distanceTraveled(5, 10));
        System.out.println("Output:\t" + traveled.distanceTraveled(1, 2));
        System.out.println("Output:\t" + traveled.distanceTraveledOptimized(5, 10));
        System.out.println("Output:\t" + traveled.distanceTraveledOptimized(1, 2));
    }

    public int distanceTraveled(int mainTank, int additionalTank) {
        int traveled = 0;
        while (mainTank > 0) {
            if (mainTank >= 5) {
                traveled += 50;
                mainTank -= 5;
                if (additionalTank > 0) {
                    mainTank += 1;
                    additionalTank--;
                }
            } else {
                traveled += mainTank * 10;
                mainTank = 0;
            }

        }
        return traveled;
    }

    public int distanceTraveledOptimized(int mainTank, int additionalTank) {
        return (mainTank + Math.min((mainTank - 1) / 4, additionalTank)) * 10;
    }
}
