package in.kgcoding.Challenge83;

public class TestShapes {
    public static void main(String[] args) {
        System.out.println("Testing Shapes\n");
        //Shape shape = new Shape();

        //Circle
        System.out.println("\n Circle");
        CircleShape circle = new CircleShape(5);
        System.out.printf("Circle Radius: %5.2f\n" , circle.getRadiusInCms());
        System.out.printf("Circle Area: %5.2f\n" , circle.calculateArea());


        //Square
        System.out.println("\n Square");
        SquareShape square = new SquareShape(10.3);
        System.out.printf("Square Side: %5.2f\n" , square.getSideInCms());
        System.out.printf("Square Area: %5.2f\n" , square.calculateArea());
    }
}
