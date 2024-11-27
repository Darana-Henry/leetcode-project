//https://leetcode.com/problems/shortest-distance-to-target-string-in-a-circular-array/
package algorithms.easy.s;

public class ShortestDistanceToTargetStringInACircularArray {
    public static void main(String[] args) {
        ShortestDistanceToTargetStringInACircularArray distance = new ShortestDistanceToTargetStringInACircularArray();
        System.out.println(
                "Output:\t" + distance.closetTarget(new String[]{"hello", "i", "am", "leetcode", "hello"}, "hello", 1));
        System.out.println("Output:\t" + distance.closetTarget(new String[]{"a", "b", "leetcode"}, "leetcode", 0));
        System.out.println("Output:\t" + distance.closetTarget(new String[]{"i", "eat", "leetcode"}, "ate", 0));
    }

    public int closetTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        int answer = n;

        for (int i = 0; i < n; i++) {
            String word = words[i];
            if (word.equals(target)) {
                int dist = Math.abs(i - startIndex);
                int wrapped = n - dist;
                answer = Math.min(answer, Math.min(dist, wrapped));
            }
        }

        return answer == n ? -1 : answer;
    }
}
