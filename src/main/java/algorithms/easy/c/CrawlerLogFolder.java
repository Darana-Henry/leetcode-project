//https://leetcode.com/problems/crawler-log-folder/description/
package algorithms.easy.c;

public class CrawlerLogFolder {
    public static void main(String[] args) {
        CrawlerLogFolder crawler = new CrawlerLogFolder();
        System.out.println("Output:\t" + crawler.minOperations(new String[]{"d1/", "d2/", "../", "d21/", "./"}));
        System.out.println("Output:\t" + crawler.minOperations(new String[]{"d1/", "d2/", "./", "d3/", "../", "d31/"}));
        System.out.println("Output:\t" + crawler.minOperations(new String[]{"d1/", "../", "../", "../"}));
    }

    public int minOperations(String[] logs) {
        int count = 0;
        for (String log : logs) {
            if (log.equalsIgnoreCase("../")) {
                if (count != 0)
                    count--;
            } else if (log.equalsIgnoreCase("./")) {
            } else {
                count++;
            }
        }
        return count;
    }
}
