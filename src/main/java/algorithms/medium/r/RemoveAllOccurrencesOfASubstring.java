//https://leetcode.com/problems/remove-all-occurrences-of-a-substring/
package algorithms.medium.r;

public class RemoveAllOccurrencesOfASubstring {
    public static void main(String[] args) {
        RemoveAllOccurrencesOfASubstring obj = new RemoveAllOccurrencesOfASubstring();
        System.out.println("Output:\t" + obj.removeOccurrences("daabcbaabcbc", "abc"));
        System.out.println("Output:\t" + obj.removeOccurrences("axxxxyyyyb", "xy"));
    }

    public String removeOccurrences(String s, String part) {
        int n = part.length();

        while (s.contains(part)) {
            int i = s.indexOf(part);
            s = s.substring(0, i) + s.substring(i + n);
        }
        return s;
    }
}
