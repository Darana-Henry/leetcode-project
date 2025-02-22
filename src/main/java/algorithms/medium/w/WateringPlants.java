//https://leetcode.com/problems/watering-plants/
package algorithms.medium.w;

public class WateringPlants {
    public static void main(String[] args) {
        WateringPlants obj = new WateringPlants();
        System.out.println("Output:\t" + obj.wateringPlants(new int[]{2, 2, 3, 3}, 5));
        System.out.println("Output:\t" + obj.wateringPlants(new int[]{1, 1, 1, 4, 2, 3}, 4));
        System.out.println("Output:\t" + obj.wateringPlants(new int[]{7, 7, 7, 7, 7, 7, 7}, 8));
    }

    public int wateringPlants(int[] plants, int capacity) {
        int answer = 0, curr = capacity;

        for (int i = 0; i < plants.length; i++) {
            if (plants[i] <= curr) {
                curr -= plants[i];
                answer++;
            } else {
                answer += 2 * i + 1;
                curr = capacity - plants[i];
            }
        }

        return answer;
    }
}
