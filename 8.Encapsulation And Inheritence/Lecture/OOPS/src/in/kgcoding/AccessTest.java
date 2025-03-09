package in.kgcoding;

public class AccessTest {
    public static void main(String[] args) {

        //Test - 1
        Car car = new Car();
        car.color = "Red";
        car.model = "Swift";
        car.costOfPurchase = 7654;
        System.out.println("Car: \n" + car + "\n");

        //Test - 2
        Car newCar = new Car("Black", "BMW", 1, 5000);
        System.out.println("newCar: \n" + newCar);

        //Test - 3
        Default def = new Default();
    }
}
