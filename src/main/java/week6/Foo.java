package week6;

public class Foo {

    private SomeDependency theDependency;

    /*
     * Hard dependency. This makes testing hard.
     */
    public Foo() {
        theDependency = new SomeDependency();
    }

    /*
     * Constructor dependency injection
     */
    public Foo(SomeDependency aDependency) {
        theDependency = aDependency;
    }

    /*
     * Function we would like to test
     */
    public boolean bar() {
        return theDependency.accessDB();
    }
}
