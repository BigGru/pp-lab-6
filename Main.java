import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        Worker worker1 = new Worker("Doug", 3000, 1, "01-01-2020", "Developer");
        Worker worker2 = new Worker("Jack", 3300, 1, "02-02-2020", "Developer"); // Same ID as worker1
        Worker worker3 = new Worker("Anna", 3400, 2, "03-03-2020", "Developer");
        Manager manager = new Manager("Karen", 5150, 3, "05-05-2020", "Project Manager");

        
        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(manager);

        employees.forEach(emp -> System.out.println(emp.getName() + " has code: " + emp.hashCode()));

        System.out.println("Porównywanie " + worker2.getName() + " z innymi pracownikami:");
        for (Employee emp : employees) {
            boolean isEqual = worker2.equals(emp);
            String message = isEqual ? " Jest równy z " : " Nie jest równy z ";
            System.out.println(worker2.getName() + message + emp.getName() + " z ID: " + emp.getId());
        }
    }
}
