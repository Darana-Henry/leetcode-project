//https://leetcode.com/problems/number-of-valid-clock-times/
package algorithms.easy.n;

public class NumberOfValidClockTimes {
    public static void main(String[] args) {
        NumberOfValidClockTimes clock = new NumberOfValidClockTimes();
        System.out.println("Output:\t" + clock.countTime("?5:00"));
        System.out.println("Output:\t" + clock.countTime("0?:0?"));
        System.out.println("Output:\t" + clock.countTime("??:??"));
    }

    public int countTime(String time) {
        int hours = calc(time.substring(0, 2), 24);
        int mins = calc(time.substring(3), 60);
        return hours * mins;
    }

    public int calc(String time, int max) {
        int count = 0;
        for (int i = 0; i < max; i++) {
            boolean left = time.charAt(0) == '?' || time.charAt(0) - '0' == i / 10;
            boolean right = time.charAt(1) == '?' || time.charAt(1) - '0' == i % 10;
            count += (left && right) ? 1 : 0;
        }
        return count;
    }
}
