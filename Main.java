import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        // Create instances of Worker, some with the same ID
        employees.add(new Worker("John", 3000, 1, "01-01-2020", "Developer"));
        employees.add(new Worker("John", 3000, 1, "01-01-2020", "Developer")); // Same ID as the first
        employees.add(new Worker("Jake", 3300.75, 3, "03-03-2020", "Developer"));
        Manager manager = new Manager("Joe", 5000.1, 5, "05-05-2020", "Project Manager"); // A manager

        // Display hashCodes and test equality
        for (Employee emp : employees) {
            System.out.println(emp.getName() + " has code: " + emp.hashCode());
        }

        // Test equals method
        System.out.println("First and second workers are the same: " + employees.get(0).equals(employees.get(1)));
        System.out.println("First worker and manager are the same: " + employees.get(0).equals(manager));
    }
}
