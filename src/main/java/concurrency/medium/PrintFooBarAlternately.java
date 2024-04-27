package concurrency.medium;//https://leetcode.com/problems/print-foobar-alternately/

import java.util.concurrent.CountDownLatch;

public class PrintFooBarAlternately {
    private int n;

    private CountDownLatch[] fooLatch;
    private CountDownLatch[] barLatch;

    public PrintFooBarAlternately(int n) {
        this.n = n;

        this.fooLatch = new CountDownLatch[n];
        this.barLatch = new CountDownLatch[n];

        for (int i = 0; i < n; i++) {
            fooLatch[i] = new CountDownLatch(1);
            barLatch[i] = new CountDownLatch(1);
        }
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            if (i > 0) {
                barLatch[i - 1].await();
            }
            // printFoo.run() outputs "foo". Do not change or remove this line.
            printFoo.run();
            fooLatch[i].countDown();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            fooLatch[i].await();
            // printBar.run() outputs "bar". Do not change or remove this line.
            printBar.run();
            barLatch[i].countDown();
        }
    }
}