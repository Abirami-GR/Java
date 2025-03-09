public class Student {
    public static void main(String[] args) {
        Course java = new Course();
        Course react = new Course("React", 300);

        System.out.println();
        System.out.println("In Student Class");

        //Static
        System.out.println("Static Variable");
        System.out.println("Max Capacity :" + Course.maxCapacity);

        System.out.println("\n Static Method");
        Course.setMaxCapacity(500);

        //Java
        System.out.println("\n Java");
        System.out.println("\n Instance Variable");
        System.out.println("Course Name :" + java.courseName);
        System.out.println("Enrolled Students :" + java.enrolledStudents);

        System.out.println("\n Instance Methods");
        java.enrollStudent("Simon");
        java.unEnrollStudent("Simone");

        //React
        System.out.println("\n React");
        System.out.println("\n Instance Variable");
        System.out.println("Course Name :" + react.courseName);
        System.out.println("Enrolled Students :" + react.enrolledStudents);

        System.out.println("\n Instance Methods");
        react.enrollStudent("Gabriel");
        react.unEnrollStudent("Daniel");
    }
}
