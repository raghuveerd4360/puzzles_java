package dr.concurrency.basic;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ProduceConsume1 {

    List<Integer> list = new LinkedList<>();
    private static final int LIMIT = 10;
    private Object lock = new Object();

    public void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            synchronized (lock) {
                while (list.size() == LIMIT) {
                    lock.wait();
                }
                list.add(value++);
                lock.notify();
            }
        }
    }

    public void consume() throws InterruptedException {

        Random rand = new Random();
        while (true) {
            synchronized (lock) {
                while (list.size() == 0) {
                    lock.wait();
                }

                System.out.print("Size : " + list.size());
                int value = list.remove(0);
                System.out.println(" || Value: " + value);
                lock.notify();
            }

            Thread.sleep(rand.nextInt(1000));
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ProduceConsume1 produceConsume1 = new ProduceConsume1();
        Thread t1 = new Thread(() -> {
            try {
                produceConsume1.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                produceConsume1.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();

        //t1.join();
        //t2.join();
    }
}
