package week2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LiftTest {

    // This isn't a great test suite.
    // It just happens to be the test we wrote in class
    // in order to measure coverage
    
    @Test
    public void testCurrentFloor() {
        Lift lift = new Lift(10);
        lift.goUp();
        assertEquals(1, lift.getCurrentFloor());
    }

}
