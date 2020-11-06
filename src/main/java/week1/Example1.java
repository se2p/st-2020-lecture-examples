package week1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Example1 {

    /*
     * If x is null throw NPE
     * else return the number of
     * occurrences of 0 in x
     */
    public static int numZero(int[] x) {
        int count = 0;
        // Fault: Should be i = 0
        // Error: As soon as i = 1 during execution, but should be 0
        for(int i = 1; i < x.length; i++) {
            if(x[i] == 0) {
                count++;
            }
        }
        // Failure: As soon as the value of count differs from the expected value
        return count;
    }

    @Test
    public void testNoFailure() {
        assertEquals(1, numZero(new int[]{2, 7, 0}));
    }

    @Test
    public void testFailure() {
        assertEquals(1, numZero(new int[]{0, 7, 2}));
    }
}
