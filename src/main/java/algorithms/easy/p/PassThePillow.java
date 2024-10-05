//https://leetcode.com/problems/pass-the-pillow/description/
package algorithms.easy.p;

public class PassThePillow {
    public static void main(String[] args) {
        PassThePillow passThePillow = new PassThePillow();
        System.out.println("Output:\t" + passThePillow.passThePillowBruteForce(4, 5));
        System.out.println("Output:\t" + passThePillow.passThePillowOptimized(3, 2));
    }

    public int passThePillowBruteForce(int n, int time) {
        int i = 1;
        boolean goForward = true;
        int result = 1;

        while (i <= time) {
            if (goForward)
                result++;
            else
                result--;

            if (result == n)
                goForward = false;
            else if (result == 1)
                goForward = true;

            i++;
        }
        return result;
    }

    public int passThePillowOptimized(int n, int time) {
        int i = 1;
        while (time > 0) {
            while (i < n && time > 0) {
                i++;
                time--;
            }
            while (i > 1 && time > 0) {
                i--;
                time--;
            }
        }
        return i;
    }
}
