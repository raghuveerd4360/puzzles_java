package dr.concurrency.basic;

/*
    There are three threads T1, T2 and T3. How to ensure that T2 is run after T1 and T3 is after T2.
 */

import java.util.concurrent.CountDownLatch;

// Using join
public class ThreadOrdering {

    ThreadOrdering.ThreadOrderingThread thread1;
    ThreadOrdering.ThreadOrderingThread thread2;
    ThreadOrdering.ThreadOrderingThread thread3;


    public static void main(String[] args) throws InterruptedException {
        ThreadOrdering threadOrdering = new ThreadOrdering();
        threadOrdering.usingCountDownLatch();

    }

    public void usingJoin() throws InterruptedException {
        thread1 = new ThreadOrdering.ThreadOrderingThread("T1");
        thread2 = new ThreadOrdering.ThreadOrderingThread("T2");
        thread3 = new ThreadOrdering.ThreadOrderingThread("T3");

        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
        thread3.start();
        thread3.join();
    }

    public void usingCountDownLatch() throws InterruptedException {
        CountDownLatch latch2 = new CountDownLatch(1);
        CountDownLatch latch3 = new CountDownLatch(1);

        thread1 = new ThreadOrdering.ThreadOrderingThreadUsingLatch(latch2, "T1");
        thread2 = new ThreadOrdering.ThreadOrderingThreadUsingLatch(latch3, "T2");
        thread3 = new ThreadOrdering.ThreadOrderingThreadUsingLatch("T3");


        thread1.start();
        latch2.await();

        thread2.start();
        latch3.await();

        thread3.start();


    }


    static class ThreadOrderingThread extends Thread {
        String threadName;

        ThreadOrderingThread(String threadName) {
            this.threadName = threadName;
        }

        public void run() {
            System.out.println("Thread " + threadName + " is started and running");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    static class ThreadOrderingThreadUsingLatch extends ThreadOrderingThread {
        private CountDownLatch latch;

        ThreadOrderingThreadUsingLatch(CountDownLatch latch, String threadName) {
            super(threadName);
            this.latch = latch;
        }

        ThreadOrderingThreadUsingLatch(String threadName) {
            super(threadName);
        }

        public void run() {
            System.out.println("Thread " + threadName + " is started and running");
            try {
                Thread.sleep(2000);
                if (latch != null)
                    latch.countDown();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

