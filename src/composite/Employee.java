package composite;

public class Employee implements Worker {

    private final String name;
    private final Integer grade;

    public Employee(String name, Integer grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public void doWork() {
        System.out.printf("Employee %s doing some work\n", this);
    }

    @Override
    public boolean canWork() {
        return grade > 3;
    }

    @Override
    public String toString() {
        return name;
    }
}
