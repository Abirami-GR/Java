package in.kgcoding.abstraction;

public class Car extends Vehicle  {

    private  int noOfDoors;


    @Override
    public void makeStartSound() {
        System.out.println("Vroomm.........");
    }


    public Car(int noOfTires) {
        super(4);
    }
}
