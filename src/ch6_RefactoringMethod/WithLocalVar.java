package ch6_RefactoringMethod;

public class WithLocalVar {
    private String _name;

    void printOwing() {
        int localVar = 3;

        System.out.println(localVar);
        System.out.println(_name);
    }
}
