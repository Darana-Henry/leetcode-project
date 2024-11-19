//https://leetcode.com/problems/destination-city/
package algorithms.easy.d;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class DestinationCity {
    public static void main(String[] args) {
        DestinationCity destination = new DestinationCity();

        List<List<String>> ex1 = new ArrayList<>();
        System.out.println("Output:\t" + destination.destCity(ex1));

        List<List<String>> ex2 = new ArrayList<>();
        System.out.println("Output:\t" + destination.destCity(ex2));

        List<List<String>> ex3 = new ArrayList<>();
        System.out.println("Output:\t" + destination.destCity(ex3));
    }

    public String destCity(List<List<String>> paths) {
        Set<String> dep = new HashSet<>();

        for (List<String> path : paths)
            dep.add(path.get(0));

        for (List<String> path : paths)
            if (!dep.contains(path.get(1))) return path.get(1);

        return "";
    }
}
