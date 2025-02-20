//https://leetcode.com/problems/find-unique-binary-string/
package algorithms.medium.f;

public class FindUniqueBinaryString {
    public static void main(String[] args) {
        FindUniqueBinaryString obj = new FindUniqueBinaryString();
        System.out.println("Output:\t" + obj.findDifferentBinaryString(new String[]{"01", "10"}));
        System.out.println("Output:\t" + obj.findDifferentBinaryString(new String[]{"00", "01"}));
        System.out.println("Output:\t" + obj.findDifferentBinaryString(new String[]{"111", "011", "001"}));
    }

    public String findDifferentBinaryString(String[] nums) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < nums.length; i++)
            sb.append((nums[i].charAt(i)) == '0' ? '1' : '0');

        return sb.toString();
    }
}
