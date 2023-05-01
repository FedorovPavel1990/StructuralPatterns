package composite;

import java.util.ArrayList;
import java.util.List;

public class Department implements Worker {

    private final String name;

    private final List<Worker> employees = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    @Override
    public void doWork() {
        Worker worker = employees.stream().filter(Worker::canWork).findFirst().get();
        while (worker instanceof Department) {
            worker = ((Department) worker).employees.stream().filter(Worker::canWork).findFirst().get();
        }
        System.out.printf("Employee %s doing some work\n", worker);
    }

    @Override
    public boolean canWork() {
        return employees.stream().anyMatch(Worker::canWork);
    }

    @Override
    public String toString() {
        return name;
    }

    public void add(Worker employee) {
        employees.add(employee);
    }
    public void remove(Worker employee) {
        employees.remove(employee);
    }

}
