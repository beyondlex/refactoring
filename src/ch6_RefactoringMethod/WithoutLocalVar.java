package ch6_RefactoringMethod;

import java.util.Arrays;
import java.util.List;

public class WithoutLocalVar {
    void printOwing() {
        List<Integer> owes = Arrays.asList(39, 28, 19, 33, 103);

        System.out.println("***********************");
        System.out.println("**** Customer Owes ****");
        System.out.println("***********************");

        owes.forEach(System.out::println);
    }
}
