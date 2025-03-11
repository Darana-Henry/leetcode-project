//https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/
package algorithms.medium.n;


public class NumberOfSubstringsContainingAllThreeCharacters {
    public static void main(String[] args) {
        NumberOfSubstringsContainingAllThreeCharacters obj = new NumberOfSubstringsContainingAllThreeCharacters();
        System.out.println("Output:\t" + obj.numberOfSubstrings("abcabc"));
        System.out.println("Output:\t" + obj.numberOfSubstrings("aaacb"));
        System.out.println("Output:\t" + obj.numberOfSubstrings("abc"));
        System.out.println("Output:\t" + obj.numberOfSubstringsOptimized("abcabc"));
        System.out.println("Output:\t" + obj.numberOfSubstringsOptimized("aaacb"));
        System.out.println("Output:\t" + obj.numberOfSubstringsOptimized("abc"));
    }

    public int numberOfSubstrings(String s) {
        int n = s.length(), answer = 0, left = 0, right = 0;
        int[] freq = new int[3];

        while (right < n) {
            freq[s.charAt(right) - 'a']++;

            while (gotCount(freq)) {
                answer += n - right;
                freq[s.charAt(left) - 'a']--;
                left++;
            }
            right++;
        }

        return answer;
    }

    public boolean gotCount(int[] curr) {
        return curr[0] > 0 && curr[1] > 0 && curr[2] > 0;
    }

    public int numberOfSubstringsOptimized(String s) {
        int n = s.length(), answer = 0;
        int[] last = new int[]{-1, -1, -1};

        for (int i = 0; i < n; i++) {
            last[s.charAt(i) - 'a'] = i;
            answer += 1 + Math.min(last[0], Math.min(last[1], last[2]));
        }

        return answer;
    }
}
