package ch6_RefactoringMethod;

public class WithLocalVar {
    private String _name;

    void printOwing() {
        int localVar = 3;

        printDetails(localVar);
    }

    /**
     *
     * @param localVar 简单地将局部变量作为extracted method的参数
     */
    private void printDetails(int localVar) {
        // 被提炼的代码段：(只是读取局部变量localVar的值，并不修改它)
        System.out.println(localVar);
        System.out.println(_name);
    }
}
