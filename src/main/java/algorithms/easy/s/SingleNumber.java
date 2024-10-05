package algorithms.easy.s;//https://leetcode.com/submissions/detail/1254891907/

public class SingleNumber {

    public static void main(String[] args) {

        SingleNumber singleNumber = new SingleNumber();

        System.out.println("Output:\t" + singleNumber.singleNumber(new int[]{2, 2, 1}));
        System.out.println("Output:\t" + singleNumber.singleNumber(new int[]{4, 1, 2, 1, 2}));
    }

    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }
}
