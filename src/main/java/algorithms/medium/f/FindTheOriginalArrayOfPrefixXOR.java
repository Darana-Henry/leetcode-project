//https://leetcode.com/problems/find-the-original-array-of-prefix-xor/
package algorithms.medium.f;

public class FindTheOriginalArrayOfPrefixXOR {
    public static void main(String[] args) {
        FindTheOriginalArrayOfPrefixXOR obj = new FindTheOriginalArrayOfPrefixXOR();
        System.out.println("Output:\t" + obj.findArray(new int[]{5, 2, 0, 3, 1}));
        System.out.println("Output:\t" + obj.findArray(new int[]{13}));
    }

    public int[] findArray(int[] pref) {
        int[] answer = new int[pref.length];

        for (int i = 0, xor = 0; i < pref.length; i++) {
            answer[i] = xor ^ pref[i];
            xor ^= answer[i];
        }

        return answer;
    }
}
