package concurrency.medium;

import java.util.concurrent.Semaphore;

public class TheDiningPhilosophers {
}

class DiningPhilosophers {

    private Semaphore[] forks;
    private Semaphore pick;

    public DiningPhilosophers() {
        pick = new Semaphore(1);
        forks = new Semaphore[5];
        for (int i = 0; i < 5; i++) {
            forks[i] = new Semaphore(1);
        }
    }

    // call the run() method of any runnable to execute its code
    public void wantsToEat(
            int philosopher,
            Runnable pickLeftFork,
            Runnable pickRightFork,
            Runnable eat,
            Runnable putLeftFork,
            Runnable putRightFork) throws InterruptedException {

        Semaphore left = forks[philosopher];
        Semaphore right = forks[(philosopher + 3) % 5];

        pick.acquire();

        left.acquire();
        pickLeftFork.run();
        right.acquire();
        pickRightFork.run();
        eat.run();

        pick.release();

        putLeftFork.run();
        left.release();
        putRightFork.run();
        right.release();
    }
}
