package dr.concurrency.basic;

import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ProduceConsume2 {
    //BlockingQueue<String> queue = new ArrayBlockingQueue<>(10);
    LinkedList<String> queue = new LinkedList<>();

    Lock lock = new ReentrantLock();

    public void producer() throws InterruptedException {
        Random rand = new Random();
        while (true) {
            try {
                lock.lock();
                if (queue.size() < 10) {
                    Thread.sleep(200);
                    String msg = "Item-" + rand.nextInt(1000);
                    System.out.println("PRODUCE: " + msg);
                    queue.add(msg);
                } else {
                    System.out.println("Queue is full");
                }
            } finally {
                lock.unlock();
            }
        }
    }

    public void consumer() throws InterruptedException {
        while (true) {
            try {
                lock.lock();
                if (!queue.isEmpty()) {
                    Thread.sleep(500);
                    String msg = queue.remove();
                    System.out.println("CONSUME: " + msg);
                    /*for (String item : queue) {
                        Thread.sleep(100);
                        System.out.println(item);
                    }*/
                } else {
                    System.out.println("CONSUME: " + " QUEUE IS EMPTY !!!!");
                }
            } finally {
                lock.unlock();
            }
        }
    }


    public static void main(String[] args) {
        ProduceConsume2 produceConsume2 = new ProduceConsume2();

        Thread producer = new Thread(() -> {
            try {
                produceConsume2.producer();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });


        Thread consumer = new Thread(() -> {
            try {
                produceConsume2.consumer();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        consumer.start();
        producer.start();
    }

}
