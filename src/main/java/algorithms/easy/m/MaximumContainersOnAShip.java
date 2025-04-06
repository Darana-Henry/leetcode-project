//https://leetcode.com/problems/maximum-containers-on-a-ship/
package algorithms.easy.m;

public class MaximumContainersOnAShip {
    public static void main(String[] args) {
        MaximumContainersOnAShip obj = new MaximumContainersOnAShip();
        System.out.println("Output:\t" + obj.maxContainers(2, 3, 15));
        System.out.println("Output:\t" + obj.maxContainers(3, 5, 20));
    }

    public int maxContainers(int n, int w, int maxWeight) {
        return ((n * n * w) < maxWeight) ? n * n : maxWeight / w;
    }
}
