//https://leetcode.com/problems/water-bottles-ii/
package algorithms.medium.w;

public class WaterBottlesII {
    public static void main(String[] args) {
        WaterBottlesII obj = new WaterBottlesII();
        System.out.println("Output:\t" + obj.maxBottlesDrunk(13, 6));
        System.out.println("Output:\t" + obj.maxBottlesDrunk(10, 3));
        System.out.println("Output:\t" + obj.maxBottlesDrunkOptimized(13, 6));
        System.out.println("Output:\t" + obj.maxBottlesDrunkOptimized(10, 3));
    }

    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int answer = 0, empty = 0;

        while (numBottles > 0) {
            answer += numBottles;
            empty += numBottles;
            numBottles = 0;

            while (empty >= numExchange) {
                numBottles += 1;
                empty -= numExchange;
                numExchange++;
            }
        }

        return answer;
    }

    public int maxBottlesDrunkOptimized(int numBottles, int numExchange) {
        int answer = numBottles;

        while (numBottles >= numExchange) {
            numBottles -= numExchange;
            numExchange++;
            numBottles++;
            answer++;
        }

        return answer;
    }
}
