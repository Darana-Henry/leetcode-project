//https://leetcode.com/problems/add-to-array-form-of-integer/
package algorithms.easy.a;

import java.util.ArrayList;
import java.util.List;

public class AddToArrayFormOfInteger {
    public static void main(String[] args) {
        AddToArrayFormOfInteger integer = new AddToArrayFormOfInteger();
        System.out.println("Output:\t" + integer.addToArrayForm(new int[]{1, 2, 0, 0}, 34));
        System.out.println("Output:\t" + integer.addToArrayForm(new int[]{2, 7, 4}, 181));
        System.out.println("Output:\t" + integer.addToArrayForm(new int[]{2, 1, 5}, 806));
    }

    public List<Integer> addToArrayForm(int[] num, int k) {
        int n = num.length - 1;
        int carry = 0;
        List<Integer> answer = new ArrayList<>();

        while (n >= 0 || k > 0 || carry > 0) {
            carry += (n < 0 ? 0 : num[n--]) + k % 10;
            answer.add(carry % 10);
            carry /= 10;
            k /= 10;
        }

        return answer;
    }
}
