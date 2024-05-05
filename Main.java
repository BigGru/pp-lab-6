import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        // Instantiate employees with new fields
        employees.add(new Worker("John", 3000, 1, "01-01-2020", "Developer"));
        employees.add(new Worker("Jane", 3200.5, 2, "02-02-2020", "Developer"));
        employees.add(new Worker("Jake", 3300.75, 3, "03-03-2020", "Developer"));
        employees.add(new Worker("Jill", 3100.25, 4, "04-04-2020", "Developer"));
        employees.add(new Manager("Joe", 5000.1, 5, "05-05-2020", "Project Manager"));

        // Loop through employees and print details
        for (Employee emp : employees) {
            emp.work();  // Call work method
            // Ensure correct format specifiers: %s for String, %d for int, %f for double
            System.out.printf("- %s (ID: %d, Position: %s, Hire date: %s, Salary: %.2f).\n",
                    emp.getName(), emp.getId(), emp.getPosition(), emp.getHireDate(), emp.getSalary());
        }
    }
}
