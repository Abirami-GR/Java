import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Grade System");
        System.out.print("Enter your Grade: ");
        float grade = scanner.nextFloat();

        //Logic
        if(grade >= 90){
            System.out.println("Your Grade is A");
        } else if (grade >= 75) {
            System.out.println("Your Grade is B");
        } else if (grade >= 60) {
            System.out.println("Your Grade is C");
        } else if (grade >= 30) {
            System.out.println("Your Grade is D");
        } else {
            System.out.println("You Failed");
        }
    }
}
