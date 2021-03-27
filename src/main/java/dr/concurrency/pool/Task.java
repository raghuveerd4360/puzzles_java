package dr.concurrency.pool;

public class Task implements Runnable {
    private String name;
    private int time;

    public Task(String name, int time) {
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+ " : STARTING " + name);
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+ " : Finished " + name);
    }
}
