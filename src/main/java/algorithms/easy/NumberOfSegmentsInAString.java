//https://leetcode.com/problems/number-of-segments-in-a-string/description/
package algorithms.easy;

public class NumberOfSegmentsInAString {
    public static void main(String[] args) {
        NumberOfSegmentsInAString segments = new NumberOfSegmentsInAString();
        System.out.println("Output:\t" + segments.countSegments("Hello, my name is John"));
        System.out.println("Output:\t" + segments.countSegments("Hello"));
    }

    public int countSegments(String s) {
        String[] words = s.split(" ");
        int count = 0;
        for (String word : words) {
            if (!word.isEmpty())
                count++;
        }
        return count;
    }
}
