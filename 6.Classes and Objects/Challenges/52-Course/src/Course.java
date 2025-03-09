 class Course {
    //Static Variables
    static int maxCapacity;   //static int maxCapacity = 100;

    //Instance Variables
    String courseName;
    int enrolledStudents;

    //Array Variable
     String[] enrollmentList;

    //Static Code Block
    static {
        maxCapacity = 100;
        System.out.println("In Course Class");
        System.out.println("In Static Code Block");
    }

    //Constructor
    Course(){
        courseName = "Java";
        enrolledStudents = 200;
    }

    Course(String courseName, int enrolledStudents) {
        this.courseName = courseName;
        this.enrolledStudents = enrolledStudents;
    }

    Course(String courseName){
        this.courseName = courseName;
        this.enrolledStudents = 0;
        this.enrollmentList = new String[maxCapacity];
    }


    //Static Methods
     static void setMaxCapacity(int maxCapacity){
        Course.maxCapacity = maxCapacity;
        System.out.println("Max Capacity: " + maxCapacity);
    }

    //Instance Methods
     void enrollStudent(String studentName ){
        System.out.println("\n Enrolled Student Details");
        System.out.println("Student Name :" + studentName);
        enrollmentList[enrolledStudents] = studentName;
        enrolledStudents++;

    }

     void unEnrollStudent(String studentName ){
        System.out.println("\n Un-Enrolled Student Details");
        System.out.println("Student Removed :" + studentName);
        enrolledStudents--;

    }


}

