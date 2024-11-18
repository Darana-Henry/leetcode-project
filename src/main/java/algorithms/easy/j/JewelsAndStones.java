//https://leetcode.com/problems/jewels-and-stones/
package algorithms.easy.j;

public class JewelsAndStones {
    public static void main(String[] args) {
        JewelsAndStones jewels = new JewelsAndStones();
        System.out.println("Output:\t" + jewels.numJewelsInStones("aA", "aAAbbbb"));
        System.out.println("Output:\t" + jewels.numJewelsInStones("z", "ZZ"));
    }

    public int numJewelsInStones(String jewels, String stones) {
        int[] jCount = new int[128];
        int answer = 0;

        for (char ch : jewels.toCharArray())
            jCount[ch] = 1;

        for (char ch : stones.toCharArray())
            answer += jCount[ch];

        return answer;
    }
}
