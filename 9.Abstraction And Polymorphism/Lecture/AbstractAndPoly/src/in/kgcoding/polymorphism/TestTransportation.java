package in.kgcoding.polymorphism;

public class TestTransportation {
    public static void main(String[] args) {
        Car c = new Car();
        //Vehicle v = new Vehicle();
        Plane p = new Plane();

        //castTest(v);
        castTest(c); // child of vehicle
        castTest(p); // child of vehicle



        //Vehicle vCar = new Car();
        //Car cVehicle = (Car) new Vehicle();

        //Object ref = new Car();
        //Car car = (Car) new Object();
    }

//    private static void castTest(Vehicle veh){
//        //veh.start();
//        //veh.noOfDoors();
//        Car cVehicle = (Car) veh;
//        cVehicle.start();
//        ((Car) veh).noOfDoors();
//        System.out.printf("No of Doors: %d", cVehicle.noOfDoors());
//
//
//    }
//}


private static void castTest(Vehicle veh) {

//    veh.start();

    if (veh instanceof Car) {
        //System.out.println("Yes I'm a car");
        veh.start();
    } else {
        //System.out.println("No I'm not a car, I'm a plane");
        veh.start();
    }



   }
}
