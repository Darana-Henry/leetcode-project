//https://leetcode.com/problems/find-the-child-who-has-the-ball-after-k-seconds/
package algorithms.easy.f;

public class FindTheChildWhoHasTheBallAfterKSeconds {
    public static void main(String[] args) {
        FindTheChildWhoHasTheBallAfterKSeconds ball = new FindTheChildWhoHasTheBallAfterKSeconds();
        System.out.println("Output:\t" + ball.numberOfChild(3, 5));
        System.out.println("Output:\t" + ball.numberOfChild(5, 6));
        System.out.println("Output:\t" + ball.numberOfChild(4, 2));
    }

    public int numberOfChild(int n, int k) {
        n--;
        k = k % ((n) * 2);
        if (k > n) return (n) - (k - n);
        else return k;
    }
}
