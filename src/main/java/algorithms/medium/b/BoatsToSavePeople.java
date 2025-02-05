//https://leetcode.com/problems/boats-to-save-people/description/
package algorithms.medium.b;

import java.util.Arrays;

public class BoatsToSavePeople {
    public static void main(String[] args) {
        BoatsToSavePeople obj = new BoatsToSavePeople();
        System.out.println("Output:\t" + obj.numRescueBoats(new int[]{1, 2}, 3));
        System.out.println("Output:\t" + obj.numRescueBoats(new int[]{3, 2, 2, 1}, 3));
        System.out.println("Output:\t" + obj.numRescueBoats(new int[]{3, 5, 3, 4}, 5));
    }

    public int numRescueBoats(int[] people, int limit) {
        int answer = 0, l = 0, r = people.length - 1;
        Arrays.sort(people);

        while (l <= r) {
            if (people[l] + people[r] <= limit) l++;
            r--;
            answer++;
        }

        return answer;
    }
}
