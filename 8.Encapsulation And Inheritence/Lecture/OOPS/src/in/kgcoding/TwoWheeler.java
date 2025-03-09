package in.kgcoding;

import in.kgcoding.inheritance.Vehicle;

public class TwoWheeler extends Vehicle {
    public TwoWheeler(){
        //setNoOfTires(2);
        noOfTires = 4;
    }

    public void balance(){
        System.out.println("I'm balancing on two tires");
    }
}
