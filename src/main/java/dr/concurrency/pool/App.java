package dr.concurrency.pool;

public class App {
    public static void main(String[] args) throws InterruptedException {
        CustomPoolExecutor executor = new CustomPoolExecutor(5);
        Task t1 = new Task("T1", 10000);
        Task t2 = new Task("T2", 5000);
        Task t3 = new Task("T3", 6000);
        Task t4 = new Task("T4", 1000);

        executor.addTask(t1);
        executor.addTask(t2);
        executor.addTask(t3);
        executor.addTask(t4);

        //Thread.sleep(10000);

        Task t5 = new Task("T5", 5000);
        Task t6 = new Task("T6", 2000);
        executor.addTask(t5);
        executor.addTask(t6);
    }
}
