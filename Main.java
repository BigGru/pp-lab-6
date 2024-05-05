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

        // instancje
        employees.add(new Worker("Jack", 3000, 1, "01-01-2020", "Developer"));
        employees.add(new Worker("Jane", 3200.5, 2, "02-02-2020", "Developer"));
        employees.add(new Worker("John", 3000, 1, "01-01-2020", "Developer")); // Duplicate ID as the first
        employees.add(new Worker("Jake", 3300.75, 3, "03-03-2020", "Developer"));
        employees.add(new Manager("Joe", 5000.1, 5, "05-05-2020", "Project Manager"));
        employees.add(new Manager("Jess", 5100.2, 6, "06-06-2020", "HR Manager"));
        employees.add(new Worker("Jill", 3100.25, 4, "04-04-2020", "Developer"));
        employees.add(new Worker("Jasper", 3150.5, 3, "07-07-2020", "Developer")); // Duplicate ID with Jake
        employees.add(new Manager("Julia", 5200.5, 1, "08-08-2020", "IT Manager")); // Duplicate ID with John

        // łączna kwota do wypłaty
        double totalSalary = employees.stream().mapToDouble(Employee::getSalary).sum();
        double managerTotalSalary = employees.stream().filter(e -> e instanceof Manager).mapToDouble(Employee::getSalary).sum();
        double workerTotalSalary = employees.stream().filter(e -> e instanceof Worker).mapToDouble(Employee::getSalary).sum();

        // wypłata
        System.out.println("Łączna kwota do wyplaty: " + totalSalary);
        System.out.println("Łączna kwota do wyplaty dla menadzerow: " + managerTotalSalary);
        System.out.println("Łączna kwota do wyplaty dla pracownikow: " + workerTotalSalary);

        // duplikat
        Map<Integer, List<Employee>> employeeMap = new HashMap<>();
        for (Employee emp : employees) {
            employeeMap.computeIfAbsent(emp.getId(), k -> new ArrayList<>()).add(emp);
        }

        // duplikat szczegóły
        employeeMap.forEach((id, emps) -> {
            if (emps.size() > 1) {
                System.out.println("Duplikat ID " + id + " W przypadku pracowników:");
                emps.forEach(e -> System.out.println("- " + e.getName() + " (" + e.getPosition() + ", " + e.getHireDate() + ")"));
            }
        });
    }
}
