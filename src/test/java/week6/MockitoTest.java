package week6;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.AdditionalMatchers.gt;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

public class MockitoTest {


    interface Foo {
        int doSomeFoo();
        int doSomeOtherFoo(int x);
    }

    @Test
    public void test() {

        // Standard way to create a mock object
        Foo foo = mock(Foo.class);

        // You can chain sequences of expected behaviour
        when(foo.doSomeFoo()).thenReturn(42).thenThrow(new NullPointerException());

        assertEquals(42, foo.doSomeFoo());
        try {
            foo.doSomeFoo();
            fail();
        } catch(NullPointerException e) {
            // Expected
        }

        // Mocking functions with specific parameters
        when(foo.doSomeOtherFoo(1)).thenReturn(42);
        assertEquals(42, foo.doSomeOtherFoo(1));
        assertEquals(0, foo.doSomeOtherFoo(0));

        // Mocking the function with a matcher that matches any int
        when(foo.doSomeOtherFoo(anyInt())).thenReturn(42);
        assertEquals(42, foo.doSomeOtherFoo(1));
        assertEquals(42, foo.doSomeOtherFoo(0));

        // Matchers can express conditions on the input
        when(foo.doSomeOtherFoo(gt(100))).thenReturn(-42);
        assertEquals(42, foo.doSomeOtherFoo(1));
        assertEquals(-42, foo.doSomeOtherFoo(1000));

        List<Integer> mockList = mock(List.class);
        when(mockList.get(0)).thenReturn(0);
        when(mockList.get(1)).thenReturn(1);
        when(mockList.get(2)).thenReturn(2);
        when(mockList.get(gt(2))).thenThrow(IllegalArgumentException.class);
        assertEquals(1, mockList.get(1));

        // Void methods need a different syntax
        doThrow(new IllegalArgumentException()).when(mockList).clear();

        try {
            mockList.clear();
            fail();
        } catch(IllegalArgumentException e) {
            // Expected
        }

        // Example for behaviour verification
        mockList.get(0);
        verify(mockList).get(1);
        verify(mockList, atLeast(2)).get(anyInt());

        // Example for even more detailed behaviour verification
        List<Integer> myList = mock(List.class);
        myList.get(1);
        myList.get(2);

        InOrder inOrder = inOrder(myList);
        inOrder.verify(myList).get(1);
        inOrder.verify(myList).get(2);

        // A spy allows partial stubbing and behaviour verification on actual objects
        List<String> list = new LinkedList<>();
        List<String> spy = spy(list);

        spy.add("Test");
        assertEquals(1, spy.size());
        spy.clear();
        assertEquals(0, spy.size());

        verify(spy).clear();
        when(spy.size()).thenReturn(42);
        assertEquals(42, spy.size());
    }

}
