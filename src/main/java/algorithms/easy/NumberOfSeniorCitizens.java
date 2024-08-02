//https://leetcode.com/problems/number-of-senior-citizens/
package algorithms.easy;

public class NumberOfSeniorCitizens {
    public static void main(String[] args) {
        NumberOfSeniorCitizens senior = new NumberOfSeniorCitizens();
        System.out.println("Output:\t" + senior.countSeniors(
                new String[]{"7868190130M7522", "5303914400F9211", "9273338290F4010"}));
        System.out.println("Output:\t" + senior.countSeniors(new String[]{"1313579440F2036", "2921522980M5644"}));
    }

    public int countSeniors(String[] details) {
        int answer = 0;
        for (String detail : details) {
            int age = Integer.valueOf(detail.substring(11, 13));
            if (age > 60)
                answer++;
        }
        return answer;
    }
}
