//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
package algorithms.easy;

public class FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        FindSmallestLetterGreaterThanTarget smallest = new FindSmallestLetterGreaterThanTarget();
        System.out.println("Output:\t" + smallest.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'a'));
        System.out.println("Output:\t" + smallest.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'c'));
        System.out.println("Output:\t" + smallest.nextGreatestLetter(new char[]{'x', 'x', 'y', 'y'}, 'z'));
    }

    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (letters[mid] > target) right = mid;
            else left = mid + 1;
        }

        return letters[left % letters.length];
    }
}
