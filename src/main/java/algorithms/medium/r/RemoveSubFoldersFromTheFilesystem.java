//https://leetcode.com/problems/remove-sub-folders-from-the-filesystem/
package algorithms.medium.r;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class RemoveSubFoldersFromTheFilesystem {
    public static void main(String[] args) {
        RemoveSubFoldersFromTheFilesystem obj = new RemoveSubFoldersFromTheFilesystem();
        System.out.println("Output:\t" + obj.removeSubfolders(new String[]{"/a", "/a/b", "/c/d", "/c/d/e", "/c/f"}));
        System.out.println("Output:\t" + obj.removeSubfolders(new String[]{"/a", "/a/b/c", "/a/b/d"}));
        System.out.println("Output:\t" + obj.removeSubfolders(new String[]{"/a/b/c", "/a/b/ca", "/a/b/d"}));
    }

    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        List<String> answer = new ArrayList<>();
        answer.add(folder[0]);

        for (int i = 1; i < folder.length; i++) {
            String last = answer.get(answer.size() - 1);
            last += '/';

            if (!folder[i].startsWith(last)) answer.add(folder[i]);
        }
        return answer;
    }
}
