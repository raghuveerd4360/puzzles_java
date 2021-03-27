package dr.puzzles.dynamic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GridTravellerTest {

    @Test
    public void testMethod1() {
        Assertions.assertEquals(3, GridTraveller.method1(2, 3));
        Assertions.assertEquals(3, GridTraveller.method1(3, 2));
        Assertions.assertEquals(6, GridTraveller.method1(3, 3));
        long start = System.currentTimeMillis();
        Assertions.assertEquals(2333606220L, GridTraveller.method1(18, 18));
        long end = System.currentTimeMillis();
        System.out.println("Method 1 = " + (end - start) / 1000);
    }

    @Test
    public void testMethod2() {
        Assertions.assertEquals(3, GridTraveller.method2(2, 3));
        Assertions.assertEquals(3, GridTraveller.method2(3, 2));
        Assertions.assertEquals(6, GridTraveller.method2(3, 3));
        long start = System.currentTimeMillis();
        Assertions.assertEquals(2333606220L, GridTraveller.method2(18, 18));
        long end = System.currentTimeMillis();
        System.out.println("Method 2 = " + (end - start) / 1000);
    }

    @Test
    public void testMethod3() {
        Assertions.assertEquals(3, GridTraveller.method3(2, 3));
        Assertions.assertEquals(3, GridTraveller.method3(3, 2));
        Assertions.assertEquals(6, GridTraveller.method3(3, 3));
        long start = System.currentTimeMillis();
        Assertions.assertEquals(2333606220L, GridTraveller.method3(18, 18));
        long end = System.currentTimeMillis();
        System.out.println("Method 3 = " + (end - start) / 1000);
    }
}