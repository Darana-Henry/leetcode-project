//https://leetcode.com/problems/bulls-and-cows/
package algorithms.medium.b;

public class BullsAndCows {
    public static void main(String[] args) {
        BullsAndCows obj = new BullsAndCows();
        System.out.println("Output:\t" + obj.getHint("1807","7810"));
        System.out.println("Output:\t" + obj.getHint("1123","0111"));
    }

    public String getHint(String secret, String guess) {
        int n = secret.length(), bulls = 0, cows = 0;
        int[] count = new int[10];

        for (int i = 0; i < n; i++) {
            if (secret.charAt(i) == guess.charAt(i))
                bulls++;
            else {
                if (count[secret.charAt(i) - '0']++ < 0)
                    cows++;
                if (count[guess.charAt(i) - '0']-- > 0)
                    cows++;
            }
        }

        return bulls + "A" + cows + "B";
    }}
