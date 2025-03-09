package in.kgcoding.Challenge114;

import java.util.List;

public class TestingSort {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Anthony Edward Stark", 1000),
                new Employee("Steven Grant Rogers", 80),
                new Employee("Natalia Alianovna Romanoff ", 80),
                new Employee("Robert Bruce Banner", 60),
                new Employee("Clinton Francis Barton", 60)
        );

        employees.stream()
                //.sorted(Comparator.comparingInt(Employee::getSalary))
                .sorted((emp1,emp2) -> emp1.getSalary() - emp2.getSalary())
                //.sorted((emp1, emp2) ->
                //        Integer.compare(emp1.getSalary(), emp2.getSalary()))
                .forEach(System.out::println);
    }

}
