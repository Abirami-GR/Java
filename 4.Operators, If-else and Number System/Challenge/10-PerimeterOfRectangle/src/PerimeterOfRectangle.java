import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        //Input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Perimeter of a Rectangle");
        System.out.println("Please enter all four sides in cms");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();

        //Logic
        double perimeter = a + b + c + d;

        //Output
        System.out.println("Perimeter of the Rectangle is: " + perimeter + "cms");
    }
}
