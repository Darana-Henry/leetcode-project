//https://leetcode.com/problems/check-if-number-is-a-sum-of-powers-of-three/
package algorithms.medium.c;

public class CheckIfNumberIsASumOfPowersOfThree {
    public static void main(String[] args) {
        CheckIfNumberIsASumOfPowersOfThree obj = new CheckIfNumberIsASumOfPowersOfThree();
        System.out.println("Output:\t" + obj.checkPowersOfThreeOptimized(12));
        System.out.println("Output:\t" + obj.checkPowersOfThreeOptimized(91));
        System.out.println("Output:\t" + obj.checkPowersOfThreeOptimized(21));
        System.out.println("Output:\t" + obj.checkPowersOfThree(12));
        System.out.println("Output:\t" + obj.checkPowersOfThree(91));
        System.out.println("Output:\t" + obj.checkPowersOfThree(21));
    }

    public boolean checkPowersOfThreeOptimized(int n) {
        while (n > 0) {
            if (n % 3 == 2) return false;
            n /= 3;
        }
        return true;
    }

    public boolean checkPowersOfThree(int n) {
        return check(0, n);
    }

    public boolean check(int power, int n) {
        if (n == 0) return true;
        if (n < Math.pow(3, power)) return false;
        boolean with = check(power + 1, (int) (n - Math.pow(3, power)));
        boolean skip = check(power + 1, n);
        return with || skip;
    }
}
