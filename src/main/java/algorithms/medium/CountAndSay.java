//https://leetcode.com/problems/count-and-say/description/
package algorithms.medium;

public class CountAndSay {
    public static void main(String[] args) {
        CountAndSay count = new CountAndSay();
        System.out.println("Output:\t" + count.countAndSay(4));
        System.out.println("Output:\t" + count.countAndSay(1));
    }

    public String countAndSay(int n) {
        String current = "1";
        while (--n > 0) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < current.length(); ) {
                int count = 0;
                char ch = current.charAt(i);
                while (i < current.length() && current.charAt(i) == ch) {
                    i++;
                    count++;
                }
                sb.append(count).append(ch);
            }
            current = sb.toString();
        }
        return current;
    }
}
