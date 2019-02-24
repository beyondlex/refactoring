package ch7_HideDelegate;

public class Person {
    Department department;

    public Person getManager() {
        // Hide delegate here.
        return department.getManager();
    }
}

class Department {
    private Person manager;

    public Person getManager() {
        return manager;
    }
}

class Main {
    public static void main(String[] args) {
        Person jim = new Person();
        // Who is jim's manager?
        //Person manager = jim.department.getManager();
        Person manager = jim.getManager();
    }
}

