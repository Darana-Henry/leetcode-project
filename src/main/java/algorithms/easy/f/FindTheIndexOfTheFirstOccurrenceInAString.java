package algorithms.easy.f; //https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/

public class FindTheIndexOfTheFirstOccurrenceInAString {

    public static void main(String[] args) {

        FindTheIndexOfTheFirstOccurrenceInAString findTheIndexOfTheFirstOccurrenceInAString = new FindTheIndexOfTheFirstOccurrenceInAString();

        String haystack = "saidbutsad";
        String needle = "sad";
        System.out.println("Output:\t" + findTheIndexOfTheFirstOccurrenceInAString.strStr(haystack, needle));
    }

    public int strStr(String haystack, String needle) {

        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (haystack.substring(i, needle.length() + i).equals(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }
}
