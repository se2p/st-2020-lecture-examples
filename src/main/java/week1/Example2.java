package week1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Example2 {

    /*
     * Effect: if x==null throw NullPointerException.
     * Otherwise, return the index of the last element in the array ‘x’ that equals integer ’y’.
     * Return -1 if no such element exists.
     */
    public int findLast(int[] x, int y) {
        // Fault: Should be i >= 0
        for (int i = x.length - 1; i > 0; i--) {
            if (x[i] == y) {
                return i;
            }
        }
        return -1;
    }

    @Test
    public void testFaultNotReached() {
        assertThrows(NullPointerException.class,
                () -> { findLast(null, 0); });
    }

    @Test
    public void testNoError() {
        assertEquals(1, findLast(new int[]{2, 3, 5}, 3));
    }


    @Test
    public void testErrorNoFailure() {
        assertEquals(-1, findLast(new int[]{2, 3, 5}, 7));
    }

    @Test
    public void testFailure() {
        assertEquals(0, findLast(new int[]{2, 3, 5}, 2));
    }
}
