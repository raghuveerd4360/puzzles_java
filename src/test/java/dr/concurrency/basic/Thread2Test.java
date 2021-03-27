package dr.concurrency.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Thread2Test {
    @Test
    public void testThread2() {
        Thread2 thread2 = new Thread2();
        thread2.run();
        System.out.println("in testThread2");
    }
}