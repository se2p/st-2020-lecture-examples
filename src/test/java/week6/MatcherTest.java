package week6;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class MatcherTest {

    @Test
    public void test() {
        int x = 42;

        assertThat(x, is(equalTo(42)));

        x = 17;
        assertThat(x, is(allOf(lessThan(20), greaterThan(15))));

        assertThat("test", anyOf(startsWith("te"), endsWith("st")));

        List<Integer> list = Arrays.asList(3,4,5,6);
        assertThat(list, everyItem(greaterThan(2)));
    }

}
