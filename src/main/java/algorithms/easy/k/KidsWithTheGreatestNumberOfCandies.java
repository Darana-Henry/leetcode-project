//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/
package algorithms.easy.k;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {

    public static void main(String[] args) {

        KidsWithTheGreatestNumberOfCandies candies = new KidsWithTheGreatestNumberOfCandies();

        System.out.println("Output:\t" + candies.kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3));
        System.out.println("Output:\t" + candies.kidsWithCandies(new int[]{4, 2, 1, 1, 2}, 1));
        System.out.println("Output:\t" + candies.kidsWithCandies(new int[]{12, 1, 12}, 10));
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = -1;
        List<Boolean> result = new ArrayList<>();

        for (int c : candies) {
            if (c > maxCandies)
                maxCandies = c;
        }

        for (int c : candies) {
            if (c + extraCandies >= maxCandies)
                result.add(true);
            else
                result.add(false);
        }
        return result;
    }
}
