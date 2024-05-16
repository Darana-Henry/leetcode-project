package concept.semaphore;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class MainSemaphore {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        final MainSemaphore m = new MainSemaphore();
        final Semaphore semaphore = new Semaphore(3);
        final int numsThreads = 99;
        final ExecutorService executor = Executors.newFixedThreadPool(numsThreads + 1);

        try {
            for (int i = 0; i < numsThreads; i++) {
                executor.submit(() -> {
                    m.tryAcquire(semaphore);
                });
            }
            executor.submit(() -> {
                while (true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Current Queue Length: " + semaphore.getQueueLength());
                    if (semaphore.getQueueLength() == 0)
                        break;
                }
            });
        } finally {
            // Shutdown the executor service when done
            executor.shutdown();
        }
    }

    private void tryAcquire(Semaphore semaphore) {

        try {
            semaphore.acquire();
            Thread.sleep(RANDOM.nextInt(1000));
            semaphore.release();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
