//https://leetcode.com/problems/count-items-matching-a-rule/
package algorithms.easy.c;

import java.util.Arrays;
import java.util.List;

public class CountItemsMatchingARule {

    public static void main(String[] args) {
        CountItemsMatchingARule matching = new CountItemsMatchingARule();
        System.out.println("Output:\t" + matching.countMatches(
                Arrays.asList(Arrays.asList("phone", "blue", "pixel"), Arrays.asList("computer", "silver", "lenovo"),
                        Arrays.asList("phone", "gold", "iphone")), "color", "silver"));
        System.out.println("Output:\t" + matching.countMatches(
                Arrays.asList(Arrays.asList("phone", "blue", "pixel"), Arrays.asList("computer", "silver", "lenovo"),
                        Arrays.asList("phone", "gold", "iphone")), "type", "phone"));
    }

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int answer = 0;
        int match = "type".equals(ruleKey) ? 0 : ("color".equals(ruleKey) ? 1 : 2);

        for (List<String> item : items)
            if (item.get(match).equals(ruleValue)) answer++;

        return answer;
    }
}
