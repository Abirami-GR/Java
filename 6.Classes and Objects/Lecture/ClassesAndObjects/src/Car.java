public class Car {
        static int noOfCarsSold;
        int noOfWheels;
        String color;
        float maxSpeed;
        float currentFuelInLiters;
        int noOfSeats;

        // first searched when blueprint is loaded
        static{
            noOfCarsSold = 0;
            System.out.println("I'm Static block");
        }

        // first searched when object is created even before constructor
        {
            noOfCarsSold++;
            System.out.println("I'm init block");
        }

        Car(){
            this("Black");
            currentFuelInLiters = 5;
        }

       Car(String color){
            noOfWheels = 4;
            this.color = color;
            maxSpeed = 150;
            currentFuelInLiters = 2;
            noOfSeats = 5;
       }



        public Car start(){
            if(currentFuelInLiters == 0){
                System.out.println("Car is out of fuel");
            } else if(currentFuelInLiters < 5){
                System.out.println("Car is in reserved mode, Please refill");
            } else {
                System.out.println("Car has started.... bruhhhhhhhhhhh");
            }

            return this;
        }

        public void drive(){
            System.out.println("Car is driving");
            currentFuelInLiters--;
        }

        public void addFuel(float currentFuelInLiters){
            this.currentFuelInLiters += currentFuelInLiters;


        }

        public float getCurrentFuelLevel(){
            return  currentFuelInLiters;
        }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("I'm in finalize");
    }
}
