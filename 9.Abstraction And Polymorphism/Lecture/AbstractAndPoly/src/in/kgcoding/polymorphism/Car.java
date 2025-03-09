package in.kgcoding.polymorphism;

//public class Car extends Vehicle {
//  public int noOfDoors () {
//      return  5;
//  }
//}


class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car is Starting");
    }

    public int noOfDoors () {
        return  5;
    }
}
