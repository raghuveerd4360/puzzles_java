package dr.basic;

public class InnerStaticExample {
    private int count;

    private void increment() {
        count++;
    }

    static class Incrementor {
        public void increment(InnerStaticExample e) {
            e.increment();
        }
    }
}
