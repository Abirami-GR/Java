package in.kgcoding.Challenge83;

public class CircleShape extends Shape{

    private final double radiusInCms;

    public CircleShape(double radiusInCms){
        this.radiusInCms = radiusInCms;
    }

    public double getRadiusInCms() {
        return radiusInCms;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radiusInCms, 2);
    }
}
