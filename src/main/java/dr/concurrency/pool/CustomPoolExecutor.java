package dr.concurrency.pool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class CustomPoolExecutor {
    private final BlockingQueue<Runnable> queue;
    public CustomPoolExecutor(int numThreads) {
        queue = new LinkedBlockingDeque<>();
        for (int count = 0; count < numThreads; count++) {
            Runnable task = new Worker();
            Thread thread = new Thread(task, "Thread-"+count);
            thread.start();
        }
    }

    public void addTask(Runnable r) {
        try {
            queue.put(r);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    class Worker implements Runnable {
        public void run() {
            while(true) {
                try {
                    queue.take().run();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
