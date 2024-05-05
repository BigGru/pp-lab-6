import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Doug", 2500.00, 1);
        Worker worker2 = new Worker("Jack", 3200.00, 2);
        Worker worker3 = new Worker("Anna", 3500.00, 3);
        Worker worker4 = new Worker("Bill", 3700.00, 4);
        Manager manager = new Manager("Karen", 6000.00, 5);

        
        System.out.println(worker1.getName() + " zarabia " + String.format("%.2f", worker1.getSalary()));
        worker1.work();
        System.out.println(worker2.getName() + " zarabia " + String.format("%.2f", worker2.getSalary()));
        worker2.work();
        System.out.println(worker3.getName() + " zarabia " + String.format("%.2f", worker3.getSalary()));
        worker3.work();
        System.out.println(worker4.getName() + " zarabia " + String.format("%.2f", worker4.getSalary()));
        worker4.work();
        System.out.println(manager.getName() + " zarabia " + String.format("%.2f", manager.getSalary()));
        manager.work();
    }
    }

