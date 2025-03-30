//https://leetcode.com/problems/fruits-into-baskets-ii/
package algorithms.easy.f;

public class FruitsIntoBasketsII {
    public static void main(String[] args) {
        FruitsIntoBasketsII obj = new FruitsIntoBasketsII();
        System.out.println("Output:\t" + obj.numOfUnplacedFruits(new int[]{4, 2, 5}, new int[]{3, 5, 4}));
        System.out.println("Output:\t" + obj.numOfUnplacedFruits(new int[]{3, 6, 1}, new int[]{6, 4, 7}));
    }

    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int answer = 0;
        for (int fruit : fruits) {
            for (int i = 0; i < baskets.length; i++) {
                if (fruit <= baskets[i]) {
                    answer++;
                    baskets[i] = 0;
                    break;
                }
            }
        }
        return fruits.length - answer;
    }
}
