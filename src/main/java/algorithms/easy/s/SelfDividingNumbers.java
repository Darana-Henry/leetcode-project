//https://leetcode.com/problems/self-dividing-numbers/
package algorithms.easy.s;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public static void main(String[] args) {
        SelfDividingNumbers self = new SelfDividingNumbers();
        System.out.println("Output:\t" + self.selfDividingNumbers(1, 22));
        System.out.println("Output:\t" + self.selfDividingNumbers(47, 85));
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> answer = new ArrayList<>();

        for (int i = left; i <= right; i++)
            if (isSelfDividing(i)) answer.add(i);

        return answer;
    }

    public boolean isSelfDividing(int i) {
        for (int num = i; num != 0; num /= 10) {
            int digit = num % 10;
            if (digit == 0 || i % digit != 0) return false;
        }
        return true;
    }
}
