public class StudentToString {
    String name;
    int age;
    String rollNumber;
    String house;

    public StudentToString(String name, int age, String rollNumber, String house) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.house = house;
    }

    @Override
    public String toString() {
        return "StudentToString {" +
                " \n    name = '" + name + '\'' +
                ",\n    age = " + age +
                ",\n    rollNumber = '" + rollNumber + '\'' +
                ",\n    house = '" + house + '\'' + "\n" +
                '}';
    }

    public static void main(String[] args) {
        StudentToString sts = new StudentToString("Simon", 45, "01", "Gryffindor");
        System.out.println(sts);
    }
}
