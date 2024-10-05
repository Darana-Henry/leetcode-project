//https://leetcode.com/problems/distribute-candies-to-people/
package algorithms.easy.d;

public class DistributeCandiesToPeople {
    public static void main(String[] args) {
        DistributeCandiesToPeople distribute = new DistributeCandiesToPeople();
        System.out.println("Output:\t" + distribute.distributeCandies(7,4));
        System.out.println("Output:\t" + distribute.distributeCandies(10, 3));
    }

    public int[] distributeCandies(int candies, int num_people) {
        int index = 0;
        int count = 1;
        int[] distribute = new int[num_people];
        while (candies > 0) {
            distribute[index % num_people] += Math.min(count, candies);
            candies -= Math.min(count, candies);
            index++;
            count++;
        }
        return distribute;
    }
}
