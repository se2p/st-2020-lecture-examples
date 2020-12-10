package week6;

public class SomeDependency {

    /*
     * Simulate that we can't use the DB for unit testing
     */
    public boolean accessDB() {
        throw new RuntimeException("Database connection not available");
    }
}
