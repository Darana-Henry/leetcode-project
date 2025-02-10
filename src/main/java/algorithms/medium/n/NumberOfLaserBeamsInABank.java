//https://leetcode.com/problems/number-of-laser-beams-in-a-bank/
package algorithms.medium.n;

public class NumberOfLaserBeamsInABank {
    public static void main(String[] args) {
        NumberOfLaserBeamsInABank obj = new NumberOfLaserBeamsInABank();
        System.out.println("Output:\t" + obj.numberOfBeams(new String[]{"011001", "000000", "010100", "001000"}));
        System.out.println("Output:\t" + obj.numberOfBeams(new String[]{"000", "111", "000"}));
    }

    public int numberOfBeams(String[] bank) {
        int answer = 0, prev = 0;

        for (String row : bank) {
            int curr = 0;

            for (char ch : row.toCharArray())
                if (ch == '1') curr++;

            if (curr > 0) {
                answer += prev * curr;
                prev = curr;
            }
        }

        return answer;
    }
}
