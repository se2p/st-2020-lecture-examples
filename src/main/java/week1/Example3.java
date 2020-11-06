package week1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Example3 {
    /**
     * Count odd or positive elements in an array.
     * @param x array to search
     * @return number of odd or positive elements in x
     * @throws NullPointerException if x is null
     */
    public int oddOrPos(int[] x) {
        int count = 0;
        for (int i = 0; i<x.length; i++) {
            // Fault: Does not count negative odd numbers, missing: || x[i]%2 == -1
            if (x[i] % 2 == 1 || x[i] > 0) {
                count++;
            }
        }
        return count;
    }

    @Test
    public void testFaultNotReached() {
        assertEquals(0, oddOrPos(new int[] {}));
    }

    @Test
    public void testFaultButNoError() {
        assertEquals(3, oddOrPos(new int[] {8, 10, 11}));
    }

    // An error always leads to a failure, so there is no test with error but no failure

    @Test
    public void testFailure() {
        assertEquals(4, oddOrPos(new int[] {-3, 8, 10, 11}));
    }

}
