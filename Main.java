import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        
        employees.add(new Worker("Doug", 2500.00, 1, "01-01-2020", "Developer"));
        employees.add(new Worker("Jack", 3200.00, 2, "02-02-2020", "Developer"));
        employees.add(new Worker("Anna", 3500.00, 3, "03-03-2020", "Developer"));
        employees.add(new Worker("Bill", 3700.00, 4, "04-04-2020", "Developer"));
        employees.add(new Manager("Karen", 6000.00, 5, "05-05-2020", "Project Manager"));
        employees.add(new Manager("Jess", 5100.2, 6, "06-06-2020", "HR Manager"));
        employees.add(new Worker("Jill", 3100.25, 4, "04-04-2020", "Developer"));
        employees.add(new Worker("Jasper", 3150.5, 3, "07-07-2020", "Developer")); // Duplicate ID with Jake
        employees.add(new Manager("Julia", 5200.5, 1, "08-08-2020", "IT Manager")); // Duplicate ID with John

       
        double totalSalary = employees.stream().mapToDouble(Employee::getSalary).sum();
        double managerTotalSalary = employees.stream().filter(e -> e instanceof Manager).mapToDouble(Employee::getSalary).sum();
        double workerTotalSalary = employees.stream().filter(e -> e instanceof Worker).mapToDouble(Employee::getSalary).sum();

        
        System.out.println("Łączna kwota wynagrodzenia wszystkich pracowników: " + totalSalary);
        System.out.println("Łączna kwota wynagrodzenia dla menadzerow: " + managerTotalSalary);
        System.out.println("Łączna kwota wynagrodzenia dla pracownikow: " + workerTotalSalary);

        
        Map<Integer, List<Employee>> employeeMap = new HashMap<>();
        for (Employee emp : employees) {
            employeeMap.computeIfAbsent(emp.getId(), k -> new ArrayList<>()).add(emp);
        }

       
        employeeMap.forEach((id, emps) -> {
            if (emps.size() > 1) {
                System.out.println("Duplikat ID " + id + " W przypadku pracowników:");
                emps.forEach(e -> System.out.println("- " + e.getName() + " (" + e.getPosition() + ", " + e.getHireDate() + ")"));
            }
        });
    }
}
