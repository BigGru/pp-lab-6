import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Worker("Doug", 3000, 1, "01-01-2020", "Developer"));
        employees.add(new Worker("Jack", 3200.5, 2, "02-02-2020", "Developer"));
        employees.add(new Worker("Anna", 3300.75, 3, "03-03-2020", "Developer"));
        employees.add(new Worker("Bill", 3100.25, 4, "04-04-2020", "Developer"));
        employees.add(new Manager("Karen", 5000.1, 5, "05-05-2020", "Project Manager"));

        for (Employee emp : employees) {
            emp.work(); 

            System.out.printf("- %s (ID: %d, Position: %s, Hire date: %s, Salary: %.2f).\n",
                    emp.getName(), emp.getId(), emp.getPosition(), emp.getHireDate(), emp.getSalary());
        }
    }
}
