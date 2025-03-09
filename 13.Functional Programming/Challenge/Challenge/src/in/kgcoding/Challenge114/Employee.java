package in.kgcoding.Challenge114;

public class Employee {
    private final String name;
    private final int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee {" +
                "\n name='" + name + '\'' +
                ",\n salary=" + salary + " " +
                '}';
    }
}
