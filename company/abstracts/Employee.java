package company.abstracts;

import company.interfaces.Employable;

public abstract class Employee implements Employable {
    private String name;
    private double salary;
    private int id;
    private String hireDate;  // New field
    private String position;  // New field

    public Employee(String name, double salary, int id, String hireDate, String position) {
        this.name = name;
        this.salary = salary;
        this.id = id;
        this.hireDate = hireDate;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public String getHireDate() {
        return hireDate;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public int hashCode() {
        return id;  // Simple hashCode implementation using the ID
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee other = (Employee) obj;
        return id == other.id;  // Comparing employees based on their ID
    }
}
