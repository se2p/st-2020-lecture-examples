package week6;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static com.google.common.truth.Truth.assertThat;

public class TruthTest {

    @Test
    public void test() {
        int x = 42;

        assertThat(x).isEqualTo(42);
        assertThat(x).isGreaterThan(0);

        List<Integer> theList = Arrays.asList(1,2,3,4,5,6);
        assertThat(theList).doesNotContain(10);
        assertThat(theList).isInOrder();
        // ...
    }
}
