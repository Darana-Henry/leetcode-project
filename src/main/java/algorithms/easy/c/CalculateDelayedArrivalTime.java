//https://leetcode.com/problems/calculate-delayed-arrival-time/
package algorithms.easy.c;

public class CalculateDelayedArrivalTime {
    public static void main(String[] args) {
        CalculateDelayedArrivalTime arrivalTime = new CalculateDelayedArrivalTime();
        System.out.println("Output:\t" + arrivalTime.findDelayedArrivalTime(15, 5));
        System.out.println("Output:\t" + arrivalTime.findDelayedArrivalTime(13, 11));
    }

    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return (arrivalTime + delayedTime) % 24;
    }
}
