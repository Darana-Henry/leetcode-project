//https://leetcode.com/problems/water-bottles/description/
package algorithms.easy.w;

public class WaterBottles {
    public static void main(String[] args) {
        WaterBottles waterBottles = new WaterBottles();
        System.out.println("Output:\t" + waterBottles.numWaterBottles(9, 3));
        System.out.println("Output:\t" + waterBottles.numWaterBottles(15, 4));
    }

    public int numWaterBottles(int numBottles, int numExchange) {
        int empty = numBottles;
        while (empty >= numExchange) {
            int exchanged = empty / numExchange;
            numBottles = numBottles + exchanged;
            empty = empty - exchanged * numExchange + exchanged;
        }
        return numBottles;
    }
}
