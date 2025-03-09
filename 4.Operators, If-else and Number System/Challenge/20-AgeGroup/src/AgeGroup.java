import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Age Group");
        System.out.print("Enter your Age: ");
        int age = scanner.nextInt();

        //Logic
        if(age < 13){
            System.out.println("Your are a Child");
        } else if(age < 20){
            System.out.println("Your are a Teen");
        } else if(age < 60){
            System.out.println("Your are an Adult");
        } else {
            System.out.println("Your are a Senior");
        }
    }
}
