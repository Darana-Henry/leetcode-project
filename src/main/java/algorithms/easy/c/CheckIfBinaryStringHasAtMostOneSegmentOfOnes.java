//https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/
package algorithms.easy.c;

public class CheckIfBinaryStringHasAtMostOneSegmentOfOnes {
    public static void main(String[] args) {
        CheckIfBinaryStringHasAtMostOneSegmentOfOnes segment = new CheckIfBinaryStringHasAtMostOneSegmentOfOnes();
        System.out.println("Output:\t" + segment.checkOnesSegment("1001"));
        System.out.println("Output:\t" + segment.checkOnesSegment("110"));
    }

    public boolean checkOnesSegment(String s) {
        return !s.contains("01");
    }
}
