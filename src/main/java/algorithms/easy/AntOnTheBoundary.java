//https://leetcode.com/problems/ant-on-the-boundary/
package algorithms.easy;

public class AntOnTheBoundary {
    public static void main(String[] args) {
        AntOnTheBoundary ant = new AntOnTheBoundary();
        System.out.println("Output:\t" + ant.returnToBoundaryCount(new int[]{2, 3, -5}));
        System.out.println("Output:\t" + ant.returnToBoundaryCount(new int[]{3, 2, -3, -4}));
    }

    public int returnToBoundaryCount(int[] nums) {
        int count = 0;
        int position = 0;
        for (int num : nums) {
            position += num;
            if (position == 0) count++;
        }
        return count;
    }
}
