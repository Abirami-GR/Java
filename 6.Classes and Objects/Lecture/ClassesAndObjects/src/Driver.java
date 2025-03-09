public class Driver {
    String name;
    String dateOfLicense;
    int age;
    static int minAgeForDriving = 18;

    public boolean isAllowedToDrive(){
        return this.age >= minAgeForDriving;
    }


    public static void main(String[] args) {
//        Car myCar = new Car();
//        myCar.addFuel(6);
//        myCar.drive();
//        myCar.drive();
//        myCar.drive();
//        myCar.addFuel(3);
//        myCar.drive();
//        System.out.println(myCar.getCurrentFuelLevel());

        Car swift = new Car("Red");
        Car thar = new Car();
        //thar = null;
        //swift.addFuel(6);
        //Car startedCar = swift.start();
        //startedCar.drive();
        swift.start().drive();
        System.out.println(swift.color);

        //Driver myDriver = new Driver();
        //myDriver.dateOfLicense = "23/7/2020";
        //minAgeForDriving = 20;
        //System.out.println(Driver.minAgeForDriving);
    }


}
