package in.kgcoding.inheritance;

public class Vehicle {
    //private int noOfTires;
    protected int noOfTires;
    public void commute(){
        System.out.printf("I'm going from place A to Place B using %d tires \n", noOfTires);
    }

    public void setNoOfTires(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    @Override
    public String toString() {
        return "Vehicle {" +
                "\n noOfTires = " + noOfTires + "\n" +
                '}';
    }
}
