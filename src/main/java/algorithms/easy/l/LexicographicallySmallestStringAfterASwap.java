//https://leetcode.com/problems/lexicographically-smallest-string-after-a-swap/
package algorithms.easy.l;

public class LexicographicallySmallestStringAfterASwap {
    public static void main(String[] args) {
        LexicographicallySmallestStringAfterASwap swap = new LexicographicallySmallestStringAfterASwap();
        System.out.println("Output:\t" + swap.getSmallestString("45320"));
        System.out.println("Output:\t" + swap.getSmallestString("001"));
    }

    public String getSmallestString(String s) {
        char[] arr = s.toCharArray();
        for (int i = 1; i < arr.length; ++i) {
            if ((arr[i - 1] & 1) == (arr[i] & 1) && arr[i - 1] > arr[i]) {
                char temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
                break;
            }
        }
        return new String(arr);
    }
}
