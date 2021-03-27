package dr.concurrency.basic;

public class Thread1 extends Thread {

    @Override
    public void run() {
        for(int i = 0;i<10;i++) {
            try {
                Thread.sleep(100);

                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
