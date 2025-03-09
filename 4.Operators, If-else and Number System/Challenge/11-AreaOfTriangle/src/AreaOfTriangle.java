import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        //Input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Area of Triangle!");
        System.out.print("Please enter length and breath in cms: ");
        double l = scanner.nextDouble();
        double b = scanner.nextDouble();

        //Logic
        double area =  (l * b) / 2;

        //Output
        System.out.println("Area of a Triangle: " + area);

    }
}
