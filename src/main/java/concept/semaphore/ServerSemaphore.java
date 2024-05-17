package concept.semaphore;

import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.LongAdder;

public class ServerSemaphore {

    private final Semaphore semaphore;
    private static final int NUM_USERS = 10;
    private final LongAdder loginAttempts;

    public ServerSemaphore() {
        semaphore = new Semaphore(NUM_USERS);
        loginAttempts = new LongAdder();
        new Thread(this::printStatus).start();
    }

    public boolean tryLogin() {
        loginAttempts.increment();
        return semaphore.tryAcquire();
    }

    public void logout() {
        semaphore.release();
    }

    private void printStatus() {
        while (true) {
            try {
                Thread.sleep(1000);
                int currentUsers = NUM_USERS - semaphore.availablePermits();

                if (currentUsers == 0)
                    break;

                System.out.println("Current Users: " + currentUsers + ", Login Attempts: " + loginAttempts);
            } catch (InterruptedException e) {
                throw new RuntimeException();
            }
        }
        System.out.println("Server serviced all the requests!");
        System.out.println("The server handled " + loginAttempts.longValue() + " login attempts.");
    }
}
