package company.models;

import company.abstracts.Employee;

public final class Worker extends Employee {
    // Ensure this constructor correctly passes all parameters to the superclass
    public Worker(String name, double salary, int id, String hireDate, String position) {
        super(name, salary, id, hireDate, position); // Passing all arguments to the superclass constructor
    }

    @Override
    public void work() {
        System.out.println("Worker " + getName() + " is working...");
    }
}
