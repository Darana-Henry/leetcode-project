//https://leetcode.com/problems/xor-operation-in-an-array/
package algorithms.easy.x;

public class XOROperationInAnArray {
    public static void main(String[] args) {
        XOROperationInAnArray xor = new XOROperationInAnArray();
        System.out.println("Output:\t" + xor.xorOperation(5, 0));
        System.out.println("Output:\t" + xor.xorOperation(4, 3));
    }

    public int xorOperation(int n, int start) {
        int answer = start;
        for (int i = 1; i < n; i++)
            answer ^= start + (i << 1);
        return answer;
    }
}
