//https://leetcode.com/problems/decode-xored-array/
package algorithms.easy.d;


public class DecodeXORedArray {
    public static void main(String[] args) {
        DecodeXORedArray decode = new DecodeXORedArray();
        System.out.println("Output:\t" + decode.decode(new int[]{1, 2, 3}, 1));
        System.out.println("Output:\t" + decode.decode(new int[]{6, 2, 7, 3}, 4));
    }

    public int[] decode(int[] encoded, int first) {
        int n = encoded.length;
        int[] arr = new int[n + 1];
        arr[0] = first;

        for (int i = 1; i < n + 1; i++)
            arr[i] = arr[i - 1] ^ encoded[i - 1];

        return arr;
    }
}
