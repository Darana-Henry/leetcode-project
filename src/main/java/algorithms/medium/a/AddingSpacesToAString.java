//https://leetcode.com/problems/adding-spaces-to-a-string/
package algorithms.medium.a;

public class AddingSpacesToAString {
    public static void main(String[] args) {
        AddingSpacesToAString addingSpacesToAString = new AddingSpacesToAString();
        System.out.println("Output:\t" + addingSpacesToAString.addSpaces("LeetcodeHelpsMeLearn", new int[]{8, 13, 15}));
        System.out.println("Output:\t" + addingSpacesToAString.addSpaces("icodeinpython", new int[]{1, 5, 7, 9}));
        System.out.println("Output:\t" + addingSpacesToAString.addSpaces("spacing", new int[]{0, 1, 2, 3, 4, 5, 6}));
        System.out.println(
                "Output:\t" + addingSpacesToAString.addSpacesFaster("LeetcodeHelpsMeLearn", new int[]{8, 13, 15}));
        System.out.println("Output:\t" + addingSpacesToAString.addSpacesFaster("icodeinpython", new int[]{1, 5, 7, 9}));
        System.out.println(
                "Output:\t" + addingSpacesToAString.addSpacesFaster("spacing", new int[]{0, 1, 2, 3, 4, 5, 6}));
    }

    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder(s);
        int i = 0;

        for (int space : spaces)
            sb.insert(space + i++, " ");

        return sb.toString();
    }

    public String addSpacesFaster(String s, int[] spaces) {
        int n = s.length(), m = spaces.length;
        char[] chars = new char[n + m];
        int i = 0, j = 0;

        for (char ch : s.toCharArray()) {
            if (j < m && i == spaces[j]) {
                chars[i + j] = ' ';
                j++;
            }
            chars[i + j] = ch;
            i++;
        }

        return new String(chars);
    }
}
