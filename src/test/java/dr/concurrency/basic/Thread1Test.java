package dr.concurrency.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Thread1Test {
    @Test
    public void testThread1() {
        Thread1 thread1 = new Thread1();
        thread1.run();
        System.out.println("in testThread1");
    }
}