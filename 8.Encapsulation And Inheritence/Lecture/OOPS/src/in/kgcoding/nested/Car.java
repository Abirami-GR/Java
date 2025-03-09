package in.kgcoding.nested;

public class Car {

    private int noOfDoors;
    public void repair() {
       Tire t = new Tire();
    }

//    protected static class Tire{
    protected class Tire{
        private double width;
        private double pressure;
        private String material;

        public void inflate(){ // foolja
              //noOfDoors = 4;
            noOfDoors = 4;
        }
    }
}
