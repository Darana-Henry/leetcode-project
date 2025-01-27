//https://leetcode.com/problems/generate-binary-strings-without-adjacent-zeros/
package algorithms.medium.g;

import java.util.ArrayList;
import java.util.List;

public class GenerateBinaryStringsWithoutAdjacentZeros {
    List<String> answer;
    int n;

    public static void main(String[] args) {
        GenerateBinaryStringsWithoutAdjacentZeros obj = new GenerateBinaryStringsWithoutAdjacentZeros();
        System.out.println("Output:\t" + obj.validStringsOptimized(3));
        System.out.println("Output:\t" + obj.validStringsOptimized(1));
        System.out.println("Output:\t" + obj.validStrings(3));
        System.out.println("Output:\t" + obj.validStrings(1));
    }


    public List<String> validStringsOptimized(int n) {
        answer = new ArrayList<>();
        this.n = n;
        backtrack(new StringBuilder(), -1);
        return answer;
    }

    public void backtrack(StringBuilder sb, int prev) {
        if (sb.length() == n) {
            answer.add(sb.toString());
            return;
        }

        sb.append('1');
        backtrack(sb, 1);
        sb.deleteCharAt(sb.length() - 1);

        if (prev != 0) {
            sb.append('0');
            backtrack(sb, 0);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public List<String> validStrings(int n) {
        answer = new ArrayList<>();
        this.n = n;
        backtrack("");
        return answer;
    }

    public void backtrack(String str) {
        if (str.length() == n && !answer.contains(str)) {
            answer.add(str);
            return;
        }

        if (str.length() == 0) {
            backtrack("0");
            backtrack("1");
        } else if (str.charAt(str.length() - 1) == '1') {
            backtrack(str + "0");
            backtrack(str + "1");
        } else if (str.charAt(str.length() - 1) == '0') backtrack(str + "1");
    }
}
