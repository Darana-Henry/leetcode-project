//https://leetcode.com/problems/find-the-k-beauty-of-a-number/
package algorithms.easy.f;

public class FindTheKBeautyOfANumber {
    public static void main(String[] args) {
        FindTheKBeautyOfANumber beauty = new FindTheKBeautyOfANumber();
        System.out.println("Output:\t" + beauty.divisorSubstrings(240, 2));
        System.out.println("Output:\t" + beauty.divisorSubstrings(430043, 2));
    }

    public int divisorSubstrings(int num, int k) {
        int answer = 0;
        String str = Integer.toString(num);
        for (int i = 0; i <= str.length() - k; i++) {
            int n = Integer.parseInt(str.substring(i, i + k));
            if (n != 0 && num % n == 0) answer++;
        }
        return answer;
    }
}
