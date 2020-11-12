package week2;

public class TryCatchExample {
    private void foobar() {
        throw new NullPointerException();
    }

    public void foo(int x) {
        try {
            foobar();
        } catch(NullPointerException e) {
            System.out.println("...");
        }
    }
}
