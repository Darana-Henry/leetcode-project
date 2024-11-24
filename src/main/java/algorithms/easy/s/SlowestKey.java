//https://leetcode.com/problems/slowest-key/
package algorithms.easy.s;

public class SlowestKey {
    public static void main(String[] args) {
        SlowestKey slowest = new SlowestKey();
        System.out.println("Output:\t" + slowest.slowestKey(new int[]{9, 29, 49, 50}, "cbcd"));
        System.out.println("Output:\t" + slowest.slowestKey(new int[]{12, 23, 36, 46, 62}, "spuda"));
    }

    public char slowestKey(int[] releaseTimes, String keysPressed) {
        char key = keysPressed.charAt(0);
        int max = releaseTimes[0];

        for (int i = 1; i < releaseTimes.length; i++) {
            int duration = releaseTimes[i] - releaseTimes[i - 1];
            if (duration > max || (duration == max && key < keysPressed.charAt(i))) {
                max = duration;
                key = keysPressed.charAt(i);
            }
        }

        return key;
    }
}
