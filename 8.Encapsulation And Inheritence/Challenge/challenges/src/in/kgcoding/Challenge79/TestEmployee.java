package in.kgcoding.Challenge79;

public class TestEmployee {
    public static void main(String[] args) {
        System.out.println("Employee Test");
        Employee emp = new Employee("Prashanth Jain", 30, 25000);
        System.out.println(emp.getEmployeeDetails());
        emp.setName("Golu");
        System.out.println(emp.getEmployeeDetails());

    }
}
