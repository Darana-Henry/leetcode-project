package concurrency.medium;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

public class BuildingH2O {

    public static void main(String[] args) {

    }
}

class H2O {

    private CyclicBarrier cb;
    private Semaphore hydSem;
    private Semaphore oxySem;

    public H2O() {
        cb = new CyclicBarrier(3);
        hydSem = new Semaphore(2);
        oxySem = new Semaphore(1);
    }

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {

        hydSem.acquire();
        awaitCyclicBarrier();
        // releaseHydrogen.run() outputs "H". Do not change or remove this line.
        releaseHydrogen.run();
        hydSem.release();
    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {

        oxySem.acquire();
        awaitCyclicBarrier();
        // releaseOxygen.run() outputs "O". Do not change or remove this line.
        releaseOxygen.run();
        oxySem.release();
    }

    private void awaitCyclicBarrier() {
        try {
            cb.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}


class H2O2 {

    private Semaphore hydSem;
    private Semaphore oxySem;

    public H2O2() {
        hydSem = new Semaphore(2, true);
        oxySem = new Semaphore(0, true);
    }

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {

        hydSem.acquire();
        // releaseHydrogen.run() outputs "H". Do not change or remove this line.
        releaseHydrogen.run();
        oxySem.release();
    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {

        oxySem.acquire(2);
        // releaseOxygen.run() outputs "O". Do not change or remove this line.
        releaseOxygen.run();
        hydSem.release(2);
    }
}