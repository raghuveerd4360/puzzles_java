package dr.concurrency.basic;

import java.util.ArrayList;
import java.util.List;

public class LockingBasic {

    private final List<Integer> list1 = new ArrayList<>();
    private final List<Integer> list2 = new ArrayList<>();

    private void step1() {
        synchronized (list1) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list1.add(123);
        }

    }

    private void step2() {
        synchronized (list2) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list2.add(123);
        }

    }

    public void process() {
        for (int i = 0; i < 1000; i++) {
            step1();
            step2();
        }
    }

    public static void main(String[] args) {
        LockingBasic lockingBasic = new LockingBasic();
        Thread t1 = new Thread(() -> {
            lockingBasic.process();
        });

        Thread t2 = new Thread(() -> {
            lockingBasic.process();
        });

        long start = System.currentTimeMillis();

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();

        System.out.println("Done in " + (end - start));
        System.out.println("List 1: " + lockingBasic.list1.size());
        System.out.println("List 2: " + lockingBasic.list2.size());
    }

}
