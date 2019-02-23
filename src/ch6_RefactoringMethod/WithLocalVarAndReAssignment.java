package ch6_RefactoringMethod;

import java.util.ArrayList;

/**
 * reAssigned 的 local variable
 *  1. 这个变量只在extracted method中使用
 *  2. 这个变量在extracted method之外也被使用
 *      2.1 这个变量在extracted method之后不再被使用，只需要在extracted method中修改即可
 *      2.2 这个变量在extracted method之后还被使用，需要在extracted method中返回这个变量
 */
public class WithLocalVarAndReAssignment {

    private String _name;
    private ArrayList<Integer> _amounts = new ArrayList<>();

    void printOwing() {
        double outstanding = 0.0;

        printBanner();

        for(Integer amount : _amounts) {
            outstanding += amount;
        }

        printDetails(outstanding);

    }

    private void printBanner() {
        System.out.println("***********************");
        System.out.println("**** Customer Owes ****");
        System.out.println("***********************");
    }

    private void printDetails(double localVar) {
        System.out.println(localVar);
        System.out.println(_name);
    }
}
