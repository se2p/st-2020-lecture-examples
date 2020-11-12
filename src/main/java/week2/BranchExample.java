package week2;

public class BranchExample {

    public void methodWithNoIf() {
        System.out.println("There is no branch");
    }

    public void foo(int x) {
        if (x == 42) {
            System.out.println("42");
        } else {
            System.out.println("Not 42");
        }
    }
}
