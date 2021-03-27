package dr.concurrency.basic;

public class WaitNotifyExample {
    private Thread t1;
    private Thread t2;
    private int count = 0;

    public static void main(String[] args) {

        WaitNotifyExample waitNotifyExample = new WaitNotifyExample();

        waitNotifyExample.t1 = new Thread(() -> {
            waitNotifyExample.action1();
        });
        waitNotifyExample.t2 = new Thread(() -> {
            waitNotifyExample.action2();
        });

        waitNotifyExample.t1.start();
        //t2.start();


    }


    private void action1() {

        try {
            while (true) {
                System.out.println("In action 1");
                Thread.sleep(2000);
                count++;

                if (count % 5 == 0) {
                    System.out.println("Action1 waiting");
                    wait();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private void action2() {
        try {
            while (true) {
                if (count % 5 == 0) {
                    System.out.println("Notifying");
                    Thread.sleep(1000);
                } else {
                    Thread.sleep(5000);
                    t1.notify();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}


