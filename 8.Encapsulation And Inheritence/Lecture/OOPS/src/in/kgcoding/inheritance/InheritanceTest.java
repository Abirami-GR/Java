package in.kgcoding.inheritance;

import in.kgcoding.TwoWheeler;

public class InheritanceTest {
    public static void main(String[] args) {

        //Vehicle class
        Vehicle vehicle = new Vehicle();
        vehicle.commute();
        System.out.println("Vehicle Class \n");
        System.out.println("To String: " + vehicle.toString());
        System.out.println("Hash Code: " + vehicle.hashCode());
        System.out.println("Get Class: " + vehicle.getClass());

        System.out.println("\nTwo Wheeler Class \n");
        //Two Wheeler class
        TwoWheeler two = new TwoWheeler();
        two.commute();
        two.balance();

        System.out.println("\n Motor Cycle Class \n");
        //MotorCycle class
        MotorCycle motor = new MotorCycle();
        motor.commute();
        motor.balance();
        motor.start();
    }
}
