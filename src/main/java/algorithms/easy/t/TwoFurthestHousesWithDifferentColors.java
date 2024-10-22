//https://leetcode.com/problems/two-furthest-houses-with-different-colors/
package algorithms.easy.t;

public class TwoFurthestHousesWithDifferentColors {
    public static void main(String[] args) {
        TwoFurthestHousesWithDifferentColors furthest = new TwoFurthestHousesWithDifferentColors();
        System.out.println("Output:\t" + furthest.maxDistance(new int[]{1, 1, 1, 6, 1, 1, 1}));
        System.out.println("Output:\t" + furthest.maxDistance(new int[]{1, 8, 3, 8, 3}));
        System.out.println("Output:\t" + furthest.maxDistance(new int[]{0, 1}));
    }

    public int maxDistance(int[] colors) {
        int n = colors.length;
        if (colors[0] != colors[n - 1]) return n - 1;
        int l = 0, r = n - 1;
        while (colors[++l] == colors[0]) ;
        while (colors[--r] == colors[0]) ;
        return Math.max(n - l - 1, r);
    }
}

