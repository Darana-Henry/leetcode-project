//https://leetcode.com/problems/binary-gap/
package algorithms.easy.b;

public class BinaryGap {
    public static void main(String[] args) {
        BinaryGap gap = new BinaryGap();
        System.out.println("Output:\t" + gap.binaryGap(22));
        System.out.println("Output:\t" + gap.binaryGap(8));
        System.out.println("Output:\t" + gap.binaryGap(5));
    }

    public int binaryGap(int n) {
        int answer = 0;
        int last = -1;

        for (int curr = 0; n != 0; curr++, n >>= 1) {
            if ((n & 1) == 1) {
                if (last != -1) answer = Math.max(answer, curr - last);
                last = curr;
            }
        }
        return answer;
    }
}
