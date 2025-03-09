package in.kgcoding.Challenge83;

public class SquareShape extends Shape{
    private final double sideInCms;

    public SquareShape(double sideInCms){
        this.sideInCms = sideInCms;
    }

    public double getSideInCms(){
        return sideInCms;
    }

    @Override
    public double calculateArea() {
        return Math.pow(sideInCms, 2);
    }
}
