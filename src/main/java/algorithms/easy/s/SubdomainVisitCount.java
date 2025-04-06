//https://leetcode.com/problems/subdomain-visit-count/
package algorithms.easy.s;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubdomainVisitCount {
    public static void main(String[] args) {
        SubdomainVisitCount obj = new SubdomainVisitCount();
        System.out.println("Output:\t" + obj.subdomainVisits(new String[]{"9001 discuss.leetcode.com"}));
        System.out.println("Output:\t" + obj.subdomainVisits(
                new String[]{"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"}));
    }


    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();
        List<String> answer = new ArrayList<>();

        for (String dom : cpdomains) {
            String[] cp = dom.split("\\s+");
            String[] doms = cp[1].split("\\.");
            int count = Integer.valueOf(cp[0]);
            String curr = "";

            for (int i = doms.length - 1; i >= 0; i--) {
                curr = doms[i] + ((i < doms.length - 1) ? "." : "") + curr;
                map.put(curr, map.getOrDefault(curr, 0) + count);
            }
        }

        for (String s : map.keySet())
            answer.add(map.get(s) + " " + s);

        return answer;
    }
}
