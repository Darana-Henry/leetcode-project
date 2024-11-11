//https://leetcode.com/problems/count-days-spent-together/
package algorithms.easy.c;

public class CountDaysSpentTogether {
    int[] daysInMonth = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        CountDaysSpentTogether together = new CountDaysSpentTogether();
        System.out.println("Output:\t" + together.countDaysTogether("08-15", "08-18", "08-16", "08-19"));
        System.out.println("Output:\t" + together.countDaysTogether("10-01", "10-31", "11-01", "12-31"));
    }

    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        String late = arriveAlice.compareTo(arriveBob) < 0 ? arriveBob : arriveAlice;
        String early = leaveAlice.compareTo(leaveBob) < 0 ? leaveAlice : leaveBob;
        int start = days(late);
        int end = days(early);
        return Math.max(0, end - start + 1);
    }

    public int days(String date) {
        int month = Integer.parseInt(date.substring(0, 2)) - 1;
        int day = 0;

        for (int i = 0; i < month; i++)
            day += daysInMonth[i];

        day += Integer.parseInt(date.substring(3));
        return day;
    }
}
