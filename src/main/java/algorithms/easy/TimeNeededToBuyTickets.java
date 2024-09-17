//https://leetcode.com/problems/time-needed-to-buy-tickets/
package algorithms.easy;

public class TimeNeededToBuyTickets {
    public static void main(String[] args) {
        TimeNeededToBuyTickets timeNeeded = new TimeNeededToBuyTickets();
        System.out.println("Output:\t" + timeNeeded.timeRequiredToBuy(new int[]{2, 3, 2}, 2));
        System.out.println("Output:\t" + timeNeeded.timeRequiredToBuy(new int[]{5, 1, 1, 1}, 0));
    }

    public int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;
        for (int i = 0; i < tickets.length; i++) {
            if (i <= k) time += Math.min(tickets[i], tickets[k]);
            else time += Math.min(tickets[i], tickets[k] - 1);
        }
        return time;
    }
}
