package dr.concurrency.basic.cache;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Implement High Performance cache, which allows multiple readers, but
 * implement a single writer to keep the integrity.
 */

public class App {

    //using Map to make it extendable.
    private final Map<String, Object> cache = new HashMap<>();

    //Lock lock = new ReentrantLock();
    ReadWriteLock lock = new ReentrantReadWriteLock();


    public Map<String, Object> getCache(Lock readLock) {
        try {
            readLock.lock();
            //System.out.println("CACHE SIZE is:" + cache.size());
            Map<String, Object> temp = new HashMap<>();
            for (Map.Entry<String, Object> entry : cache.entrySet()) {
                temp.put(entry.getKey(), entry.getValue());
            }
            return temp;
        } finally {
            readLock.unlock();
        }

    }

    public void processCache(Map<String, Object> cache) throws InterruptedException {
        //System.out.println("CACHE SIZE is:" + cache.size());
        Thread.sleep(10);
        /*System.out.println("-----------------------------------------------");
        for (Map.Entry<String, Object> entry : cache.entrySet()) {
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }*/
        //System.out.println("================================================");
    }

    public static void main(String[] args) throws InterruptedException {
        App app = new App();
        Lock writeLock = app.lock.writeLock();
        Lock readLock = app.lock.readLock();

        Runnable reader = () -> {
            while (true) {
                try {
                    readLock.lock();
                    app.processCache(app.getCache(readLock));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    readLock.unlock();
                }
            }

        };


        Thread read1 = new Thread(reader);
        Thread read2 = new Thread(reader);
        Thread read3 = new Thread(reader);

        read1.start();
        read2.start();
        read3.start();

        while (true) {
            try {
                writeLock.lock();
                Random rand = new Random();
                System.out.println(Thread.currentThread().getName() + " UPDATING CACHE ....");
                for (int i = 0; i < 3; i++) {
                    app.cache.put("ITEM_" + i + "_" + rand.nextInt(4), rand.nextInt(4));
                }

            } finally {
                writeLock.unlock();
                Thread.sleep(2000);
            }
        }
    }
}
