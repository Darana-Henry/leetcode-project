//https://leetcode.com/problems/count-asterisks/
package algorithms.easy.c;

public class CountAsterisks {
    public static void main(String[] args) {
        CountAsterisks asterisks = new CountAsterisks();
        System.out.println("Output:\t" + asterisks.countAsterisks("l|*e*et|c**o|*de|"));
        System.out.println("Output:\t" + asterisks.countAsterisks("iamprogrammer"));
        System.out.println("Output:\t" + asterisks.countAsterisks("yo|uar|e**|b|e***au|tifu|l"));
    }

    public int countAsterisks(String s) {
        int answer = 0;
        boolean outside = true;

        for (char ch : s.toCharArray()) {
            if (ch == '*' && outside) answer++;
            else if (ch == '|') outside = !outside;
        }

        return answer;
    }
}
