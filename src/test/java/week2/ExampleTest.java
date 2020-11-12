package week2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExampleTest {

    @Test
    public void testStatementVsLineCoverage() {
        StatementVsLineCoverage example = new StatementVsLineCoverage();
        // 2 Statements on one line
        example.foo();
    }

    @Test
    public void testImplicitCode() {
        ImplicitCode example = new ImplicitCode();
        // Only one statement in the source code
        // But there are three lines: One for the default constructor,
        // and one for the implicit return statement at the end of the
        // void method
        example.foo(0);
    }

    @Test
    public void testDivisionByZero() {
        DivisionByZero example = new DivisionByZero();
        // Is the first line in method foo covered or not? Jacoco and IntelliJ don't agree
        assertThrows(ArithmeticException.class, () -> { example.foo(0); });
    }

    @Test
    public void testBranchCoverage() {
        BranchExample example = new BranchExample();
        // IntelliJ considers a branch covered if the if-condition evaluates to true and false
        // Jacoco considers the true and false outcome as two branches
        //
        // There are two methods, but the one without if-condition
        // does not contribute to the overall branch count.
        // So even though we haven't even covered all methods
        // the tools claim 100% branch coverage.
        example.foo(42);
        example.foo(0);

        // Note: In IntelliJ you need to enable 'tracing' to collect branch coverage information
    }

    @Test
    public void testTryCatch() {
        TryCatchExample example = new TryCatchExample();
        // Jacoco will highlight the try/catch like a branch
        // but it doesn't contribute to the number of branches
        // Colour-highlighting between IntelliJ and Jacoco also differs
        example.foo(0);
    }


    @Test
    public void testSwitch() {
        SwitchExample example = new SwitchExample();
        // How many branches are there in this switch statement?
        // Jacoco and IntelliJ don't agree
        example.foo(0);
        example.foo(1);
        example.foo(42);
    }

    @Test
    public void testTernaryOperator() {
        TernaryExample example = new TernaryExample();
        // A ternary operator is treated like an if-condition
        example.foo(0);
        example.foo(42);
    }

    @Test
    public void testShortCircuitingAnd() {
        ShortCircuitAnd example = new ShortCircuitAnd();

        // These two calls are not sufficient to achieve 100% branch coverage
        // according to IntelliJ / Jacoco.
        example.foo(0, 0);
        example.foo(1, 1);

        // We also need to cover the case where x > 0 but y <= 0
        example.foo(1, 0);
    }

    @Test
    public void testShortCircuitingOr() {
        ShortCircuitOr example = new ShortCircuitOr();

        // These two calls are not sufficient to achieve 100% branch coverage
        // according to IntelliJ / Jacoco.
        example.foo(0, 0);
        example.foo(1, 1);

        // We also need to cover the case where x > 0 but y <= 0
        example.foo(1, 0);
    }
}
