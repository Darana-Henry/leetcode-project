//https://leetcode.com/problems/online-stock-span/description/
package algorithms.medium.o;

import java.util.Stack;

public class OnlineStockSpan {
    public static void main(String[] args) {
        StockSpannerLittleSlower stockLittle = new StockSpannerLittleSlower();
        System.out.println("Output:\t" + stockLittle.next(100));
        System.out.println("Output:\t" + stockLittle.next(80));
        System.out.println("Output:\t" + stockLittle.next(60));
        System.out.println("Output:\t" + stockLittle.next(70));
        System.out.println("Output:\t" + stockLittle.next(60));
        System.out.println("Output:\t" + stockLittle.next(75));
        System.out.println("Output:\t" + stockLittle.next(85));

        StockSpannerLittleSlower stockFaster = new StockSpannerLittleSlower();
        System.out.println("Output:\t" + stockFaster.next(100));
        System.out.println("Output:\t" + stockFaster.next(80));
        System.out.println("Output:\t" + stockFaster.next(60));
        System.out.println("Output:\t" + stockFaster.next(70));
        System.out.println("Output:\t" + stockFaster.next(60));
        System.out.println("Output:\t" + stockFaster.next(75));
        System.out.println("Output:\t" + stockFaster.next(85));
    }
}

class StockSpannerLittleSlower {
    int index;
    Stack<int[]> stack;

    public StockSpannerLittleSlower() {
        index = 0;
        stack = new Stack<>();
    }

    public int next(int price) {
        while (!stack.isEmpty() && stack.peek()[1] <= price) {
            stack.pop();
        }

        int span = 0;
        if (stack.isEmpty())
            span = index + 1;
        else
            span = index - stack.peek()[0];

        stack.push(new int[]{index, price});
        index++;
        return span;
    }
}

class StockSpannerLittleFaster {
    Stack<int[]> stack;

    public StockSpannerLittleFaster() {
        stack = new Stack<>();
    }

    public int next(int price) {
        int span = 1;
        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            span += stack.pop()[1];
        }
        stack.add(new int[]{price, span});
        return span;
    }
}