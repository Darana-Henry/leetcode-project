//https://leetcode.com/problems/reformat-date/
package algorithms.easy.r;

public class ReformatDate {
    public static void main(String[] args) {
        ReformatDate reformat = new ReformatDate();
        System.out.println("Output:\t" + reformat.reformatDate("20th Oct 2052"));
        System.out.println("Output:\t" + reformat.reformatDate("6th Jun 1933"));
        System.out.println("Output:\t" + reformat.reformatDate("26th May 1960"));
    }

    public String reformatDate(String date) {
        String[] parts = date.split(" ");
        String months = "   JanFebMarAprMayJunJulAugSepOctNovDec";
        int day = Integer.parseInt(parts[0].substring(0, parts[0].length() - 2));
        int month = months.indexOf(parts[1]) / 3;
        return String.format("%s-%02d-%02d", parts[2], month, day);
    }
}
