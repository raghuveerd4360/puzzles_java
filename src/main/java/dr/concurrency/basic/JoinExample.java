package dr.concurrency.basic;

public class JoinExample {

    private volatile int count;

    private synchronized void increment() {
        count ++;
    }

    private void doAction() {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                increment();
                //count++;
                /*try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
            }
        });
        t1.setName("JoinExample");

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                increment();
                //count++;
                /*try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
            }
        });
        t2.setName("JoinExample2");

        t1.start();
        t2.start();

        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("1 Thread: " + Thread.currentThread().getName() + " and count: " + count);

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("2 Thread: " + Thread.currentThread().getName() + " and count: " + count);
    }

    public static void main(String[] args) {
        JoinExample joinExample = new JoinExample();
        joinExample.doAction();
        System.out.println("Count: " + joinExample.count);
    }
}
