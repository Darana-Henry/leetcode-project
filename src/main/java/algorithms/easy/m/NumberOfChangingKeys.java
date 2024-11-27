//https://leetcode.com/problems/number-of-changing-keys/
package algorithms.easy.m;

public class NumberOfChangingKeys {
    public static void main(String[] args) {
        NumberOfChangingKeys keys = new NumberOfChangingKeys();
        System.out.println("Output:\t" + keys.countKeyChanges("aAbBcC"));
        System.out.println("Output:\t" + keys.countKeyChanges("AaAaAaaA"));
    }

    public int countKeyChanges(String s) {
        int answer = 0;
        for (int i = 1; i < s.length(); i++)
            if (!((s.charAt(i) + " ").equalsIgnoreCase(s.charAt(i - 1) + " "))) answer++;
        return answer;
    }
}
