package week6;

import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FooTest {

    @Test
    public void test() {
        SomeDependency dependency = mock(SomeDependency.class);
        when(dependency.accessDB()).thenReturn(true);
        Foo foo = new Foo(dependency);
        boolean result = foo.bar();
        assertThat(result).isTrue();
    }
}
