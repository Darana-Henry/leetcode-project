//https://leetcode.com/problems/check-if-all-1s-are-at-least-length-k-places-away/
package algorithms.easy.c;

public class CheckIfAll1sAreAtLeastLengthKPlacesAway {
    public static void main(String[] args) {
        CheckIfAll1sAreAtLeastLengthKPlacesAway kPlacesAway = new CheckIfAll1sAreAtLeastLengthKPlacesAway();
        System.out.println("Output:\t" + kPlacesAway.kLengthApart(new int[]{1, 0, 0, 0, 1, 0, 0, 1}, 2));
        System.out.println("Output:\t" + kPlacesAway.kLengthApart(new int[]{1, 0, 0, 1, 0, 1}, 2));
    }

    public boolean kLengthApart(int[] nums, int k) {
        int prev = -(k + 1);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                if (i - prev - 1 < k) return false;
                prev = i;
            }
        }
        return true;
    }
}
