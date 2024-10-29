//https://leetcode.com/problems/fruit-into-baskets/description/
package algorithms.medium.f;

public class FruitIntoBaskets {
    public static void main(String[] args) {
        FruitIntoBaskets fruits = new FruitIntoBaskets();
        System.out.println("Output:\t" + fruits.totalFruit(new int[]{1, 2, 1}));
        System.out.println("Output:\t" + fruits.totalFruit(new int[]{0, 1, 2, 2}));
        System.out.println("Output:\t" + fruits.totalFruit(new int[]{1, 2, 3, 2, 2}));
    }

    public int totalFruit(int[] fruits) {
        int max = 0;
        int currentMax = 0;
        int lastFruit = -1;
        int secondLastFruit = -1;
        int lastFruitCount = 0;

        for (int fruit : fruits) {
            if (fruit == lastFruit || fruit == secondLastFruit)
                currentMax++;
            else
                currentMax = lastFruitCount + 1;

            if (fruit == lastFruit)
                lastFruitCount++;
            else
                lastFruitCount = 1;

            if (fruit != lastFruit) {
                secondLastFruit = lastFruit;
                lastFruit = fruit;
            }

            max = Math.max(max, currentMax);
        }

        return max;
    }
}
