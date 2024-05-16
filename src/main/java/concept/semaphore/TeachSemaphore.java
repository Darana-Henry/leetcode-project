package concept.semaphore;

import java.util.concurrent.Semaphore;

public class TeachSemaphore {
    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphore = new Semaphore(1);
        System.out.println("availablePermits:\t" + semaphore.availablePermits());
        semaphore.acquire();
        System.out.println("availablePermits:\t" + semaphore.availablePermits());
        semaphore.release();
        System.out.println("availablePermits:\t" + semaphore.availablePermits());
    }
}
