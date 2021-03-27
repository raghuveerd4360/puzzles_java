package dr.concurrency.basic;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorService2 {

    public void method1() {
        ExecutorService service = Executors.newFixedThreadPool(4);

    }
}
