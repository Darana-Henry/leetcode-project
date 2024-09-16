//https://leetcode.com/problems/divide-a-string-into-groups-of-size-k/
package algorithms.easy;

public class DivideAStringIntoGroupsOfSizeK {
    public static void main(String[] args) {
        DivideAStringIntoGroupsOfSizeK groups = new DivideAStringIntoGroupsOfSizeK();
        System.out.println("Output:\t" + groups.divideString("abcdefghi", 3, 'x'));
        System.out.println("Output:\t" + groups.divideString("abcdefghij", 3, 'x'));
        System.out.println("Output:\t" + groups.divideStringOptimized("abcdefghi", 3, 'x'));
        System.out.println("Output:\t" + groups.divideStringOptimized("abcdefghij", 3, 'x'));
    }

    public String[] divideString(String s, int k, char fill) {
        int n = (s.length() + k - 1) / k;
        String[] answer = new String[n];
        int index = 0;
        for (int i = 0; i < s.length(); i += k) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < Math.min(s.length(), i + k); j++)
                sb.append(s.charAt(j));

            String curr = sb.toString();
            answer[index++] = curr;
        }

        if (answer[n - 1].length() < k) {
            int gap = k - answer[n - 1].length();
            StringBuilder sb = new StringBuilder();
            sb.append(answer[n - 1]);
            while (gap-- > 0) sb.append(fill);
            answer[--index] = sb.toString();
        }

        return answer;
    }

    public String[] divideStringOptimized(String s, int k, char fill) {
        int m = s.length();
        int n = (m + k - 1) / k;
        String[] answer = new String[n];

        if (m % k != 0) s += String.valueOf(fill).repeat(k - m % k);

        for (int i = 0; i < n; i++) {
            int start = i * k;
            int end = Math.min(start + k, s.length());
            answer[i] = s.substring(start, end);
        }

        return answer;
    }
}
