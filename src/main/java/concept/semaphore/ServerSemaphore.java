package concept.semaphore;

import java.util.concurrent.Semaphore;

public class ServerSemaphore {

    private final Semaphore semaphore;
    private static final int NUM_USERS = 100;

    public ServerSemaphore() {
        semaphore = new Semaphore(NUM_USERS);
        new Thread(() -> {
            this.printStatus();
        }).start();
    }

    public boolean tryLogin() {
        return semaphore.tryAcquire();
    }

    public void logout() {
        semaphore.release();
    }

    private void printStatus() {
        while (true) {
            try {
                Thread.sleep(1000);
                System.out.println(NUM_USERS - semaphore.availablePermits());
            } catch (InterruptedException e) {
                throw new RuntimeException();
            }
        }
    }
}
