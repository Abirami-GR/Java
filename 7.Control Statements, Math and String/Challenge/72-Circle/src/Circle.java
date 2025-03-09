import java.util.Scanner;

public class Circle {
    double radiusInMm;

    Circle(double radiusInMm){
        this.radiusInMm = radiusInMm;
    }

    @Override
    public String toString() {
        return "Circle Props:" +
                "\n Radius in mm: " + radiusInMm
                +" ,\n Circumference in mm: " + getCircumference()
                +" ,\n Area in mm2: " + getArea();
    }

    double getCircumference(){
     return 2 * Math.PI * radiusInMm;
    }

    double getArea(){
        return  Math.PI * Math.pow(radiusInMm, 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Circle");
        System.out.print("Enter the radius: ");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println(circle);
    }
}
