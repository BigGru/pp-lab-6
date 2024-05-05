import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Worker("Doug", 2500.00, 1, "01-01-2020", "Developer"));
        employees.add(new Worker("Jack", 3200.00, 2, "02-02-2020", "Developer"));
        employees.add(new Worker("Anna", 3500.00, 3, "03-03-2020", "Developer"));
        employees.add(new Worker("Bill", 3700.00, 4, "04-04-2020", "Developer"));
        employees.add(new Manager("Karen", 6000.00, 5, "05-05-2020", "Project Manager"));

        for (Employee emp : employees) {
            emp.work(); 

            System.out.printf("- %s (ID: %d, Stanowisko: %s, Zatrudniono: %s, Pensja: %.2f).\n",
                    emp.getName(), emp.getId(), emp.getPosition(), emp.getHireDate(), emp.getSalary());
        }
    }
}
