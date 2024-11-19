//https://leetcode.com/problems/unique-email-addresses/
package algorithms.easy.u;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {
    public static void main(String[] args) {
        UniqueEmailAddresses unique = new UniqueEmailAddresses();
        System.out.println("Output:\t" + unique.numUniqueEmails(
                new String[]{"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"}));
        System.out.println("Output:\t" + unique.numUniqueEmails(
                new String[]{"a@leetcode.com", "b@leetcode.com", "c@leetcode.com"}));
    }

    public int numUniqueEmails(String[] emails) {
        Set<String> answer = new HashSet<>();

        for (String email : emails) {
            String[] parts = email.split("@");
            String local = parts[0];
            String domain = parts[1];
            local = local.replace(".", "");
            int index = local.indexOf("+");
            if (index != -1) local = local.substring(0, index);
            answer.add(local + "@" + domain);
        }

        return answer.size();
    }
}
