//https://leetcode.com/problems/product-of-the-last-k-numbers/
package algorithms.medium.p;

import java.util.ArrayList;
import java.util.List;

public class ProductOfTheLastKNumbers {
    public static void main(String[] args) {
        ProductOfNumbers productOfNumbers = new ProductOfNumbers();
        productOfNumbers.add(3);
        productOfNumbers.add(0);
        productOfNumbers.add(2);
        productOfNumbers.add(5);
        productOfNumbers.add(4);
        System.out.println("Output:\t" + productOfNumbers.getProduct(2));
        System.out.println("Output:\t" + productOfNumbers.getProduct(3));
        System.out.println("Output:\t" + productOfNumbers.getProduct(4));
        productOfNumbers.add(8);
        System.out.println("Output:\t" + productOfNumbers.getProduct(2));
    }
}

class ProductOfNumbers {
    List<Integer> list = new ArrayList<>();
    int size = 0;

    public ProductOfNumbers() {
        list.add(1);
        size = 0;
    }

    public void add(int num) {
        if (num == 0) {
            this.list = new ArrayList<>();
            list.add(1);
            size = 0;
        } else {
            list.add(list.get(size) * num);
            size++;
        }
    }

    public int getProduct(int k) {
        if (k > size) return 0;
        else return list.get(size) / list.get(size - k);
    }
}