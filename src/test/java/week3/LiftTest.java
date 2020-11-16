package example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LiftTest {
	
    @Test
    public void testCurrentFloor() {
        Lift lift = new Lift(10);
        lift.goUp();
        assertEquals(1, lift.getCurrentFloor());
    }

    @Test
    public void testTopFloor() {
        Lift lift = new Lift(2);
        assertEquals(2, lift.getTopFloor());
        lift.goUp();
        lift.goUp();
        assertEquals(2, lift.getCurrentFloor());
        lift.goUp();
        assertEquals(2, lift.getCurrentFloor());
    }
    
    @Test
    public void testRiders() {
    	Lift lift = new Lift(2, 3);
    	assertEquals(3, lift.getCapacity());
    	assertEquals(0, lift.getNumRiders());
    	assertFalse(lift.isFull());
    	lift.addRiders(3);
    	assertTrue(lift.isFull());
    	assertEquals(3, lift.getNumRiders());
    }

    
    @Test
    public void testTooManyRiders() {
    	Lift lift = new Lift(2, 3);
    	lift.addRiders(4);
    	assertEquals(3, lift.getNumRiders());
    }
    
    @Test
    public void testDoNotGoDownInGroundFloor() {
    	Lift lift = new Lift(2, 3);
    	lift.goDown();
    	assertEquals(0, lift.getCurrentFloor());
    	
    }
    
    @Test
    public void testGoDown() {
    	Lift lift = new Lift(2, 3);
    	lift.goUp();
    	assertEquals(1, lift.getCurrentFloor());
    	lift.goDown();
    	assertEquals(0, lift.getCurrentFloor());    	
    }
    
    @Test
    public void testCall() {
    	Lift lift = new Lift(2, 3);
    	lift.call(3);
    	assertEquals(0, lift.getCurrentFloor());
    	lift.call(2);
    	assertEquals(2, lift.getCurrentFloor());
    	
    }
    
    @Test
    public void testCallDown() {
    	Lift lift = new Lift(2, 3);
    	lift.goUp();
    	assertEquals(1, lift.getCurrentFloor());
    	lift.call(0);
    	assertEquals(0, lift.getCurrentFloor());
    	
    }
    
    @Test
    public void testRiderBoundary() {
    	Lift lift = new Lift(2, 3);
    	lift.addRiders(2);
    	assertEquals(2, lift.getNumRiders());
    	lift.addRiders(1);
    	assertEquals(3, lift.getNumRiders());
    }
}
