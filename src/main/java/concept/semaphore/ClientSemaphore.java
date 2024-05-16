package concept.semaphore;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClientSemaphore {
    private static final int NUM_REQUESTS = 100;

    public static void main(String[] args) {
        final ServerSemaphore server = new ServerSemaphore();
        final Random random = new Random();
        final ExecutorService executorService = Executors.newFixedThreadPool(NUM_REQUESTS);

        for (int i = 0; i < NUM_REQUESTS; i++) {
            executorService.submit(() -> {
                try {
                    while (!server.tryLogin())
                        Thread.sleep(random.nextInt(1000));

                    Thread.sleep(random.nextInt(1000));
                    server.logout();
                } catch (InterruptedException e) {
                    throw new RuntimeException();
                }
            });
        }
    }
}
