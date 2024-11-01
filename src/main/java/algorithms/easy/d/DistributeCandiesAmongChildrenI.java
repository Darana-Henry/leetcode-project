//https://leetcode.com/problems/distribute-candies-among-children-i/
package algorithms.easy.d;

public class DistributeCandiesAmongChildrenI {
    public static void main(String[] args) {
        DistributeCandiesAmongChildrenI candies = new DistributeCandiesAmongChildrenI();
        System.out.println("Output:\t" + candies.distributeCandies(5, 2));
        System.out.println("Output:\t" + candies.distributeCandies(3, 3));
    }

    public int distributeCandies(int n, int limit) {
        if (n > 3 * limit) return 0;
        long answer = pairs(n + 2);
        if (n > limit) answer -= 3 * pairs(n - limit + 1);
        if (n - 2 >= 2 * limit) answer += 3 * pairs(n - 2 * limit);
        return (int) answer;
    }

    public long pairs(int n) {
        return 1L * n * (n - 1) / 2;
    }
}
