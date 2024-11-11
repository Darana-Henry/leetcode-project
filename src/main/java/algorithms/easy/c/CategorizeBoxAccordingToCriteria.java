//https://leetcode.com/problems/categorize-box-according-to-criteria/
package algorithms.easy.c;

public class CategorizeBoxAccordingToCriteria {
    public static void main(String[] args) {
        CategorizeBoxAccordingToCriteria categorize = new CategorizeBoxAccordingToCriteria();
        System.out.println("Output:\t" + categorize.categorizeBox(1000, 35, 700, 300));
        System.out.println("Output:\t" + categorize.categorizeBox(200, 50, 800, 50));
    }

    public String categorizeBox(int length, int width, int height, int mass) {
        long volume = (long) length * width * height;
        boolean isBulky = length >= 10000 || width >= 10000 || height >= 10000 || volume >= 1000000000;
        boolean isHeavy = mass >= 100;
        String[] descriptions = {"Neither", "Bulky", "Heavy", "Both"};
        int index = (isHeavy ? 1 : 0) << 1 | (isBulky ? 1 : 0);
        return descriptions[index];
    }
}
