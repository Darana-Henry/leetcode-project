package concurrency.medium;

import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

class PrintZeroEvenOdd {

    public static void main(String[] args) throws InterruptedException {
        ZeroEvenOdd zeroEvenOdd = new ZeroEvenOdd(3);
    }

}

class ZeroEvenOdd {
    private int n;
    private int lastPrinted;

    private Semaphore zeroSem;
    private Semaphore oddSem;
    private Semaphore evenSem;

    public ZeroEvenOdd(int n) throws InterruptedException {
        this.n = n;
        this.lastPrinted = 0;

        this.zeroSem = new Semaphore(1);
        this.oddSem = new Semaphore(1);
        this.evenSem = new Semaphore(1);

        try {
            this.oddSem.acquire();
            this.evenSem.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {
        int numZ = n;
        while (numZ > 0) {
            zeroSem.acquire();
            printNumber.accept(0);

            if (lastPrinted % 2 == 0)
                oddSem.release();
            else
                evenSem.release();

            numZ--;
        }

    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        int numE = n / 2;
        while (numE > 0) {
            evenSem.acquire();
            lastPrinted++;
            printNumber.accept(lastPrinted);
            zeroSem.release();
            numE--;
        }
    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
        int numO = n - n / 2;
        while (numO > 0) {
            oddSem.acquire();
            lastPrinted++;
            printNumber.accept(lastPrinted);
            zeroSem.release();
            numO--;
        }
    }
}