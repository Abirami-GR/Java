public class CarClass {
    int noOfWheels;
    int noOfDoors;
    int maxSpeed;
    String name;
    String modelNumber;
    String company;

    public CarClass(int noOfWheels, int noOfDoors, int maxSpeed, String name,
                    String modelNumber, String company) {
        this.noOfWheels = noOfWheels;
        this.noOfDoors = noOfDoors;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.modelNumber = modelNumber;
        this.company = company;
    }

    @Override
    public String toString() {
        return "\nCarClass {" +
                "\n noOfWheels=" + noOfWheels +
                ",\n noOfDoors=" + noOfDoors +
                ",\n maxSpeed=" + maxSpeed +
                ",\n name='" + name + '\'' +
                ",\n modelNumber='" + modelNumber + '\'' +
                ",\n company='" + company + '\'' + "\n" +
                 '}';
    }


//    @Override
//    public String toString() {
//        final StringBuilder sb = new StringBuilder("CarClass{");
//        sb.append("noOfWheels=").append(noOfWheels);
//        sb.append(", noOfDoors=").append(noOfDoors);
//        sb.append(", maxSpeed=").append(maxSpeed);
//        sb.append(", name='").append(name).append('\'');
//        sb.append(", modelNumber='").append(modelNumber).append('\'');
//        sb.append(", company='").append(company).append('\'');
//        sb.append('}');
//        return sb.toString();
//    }


//    @Override
//    public String toString() {
//        final StringBuffer sb = new StringBuffer("CarClass{");
//        sb.append("noOfWheels=").append(noOfWheels);
//        sb.append(", noOfDoors=").append(noOfDoors);
//        sb.append(", maxSpeed=").append(maxSpeed);
//        sb.append(", name='").append(name).append('\'');
//        sb.append(", modelNumber='").append(modelNumber).append('\'');
//        sb.append(", company='").append(company).append('\'');
//        sb.append('}');
//        return sb.toString();
//    }

    public static void main(String[] args) {
        CarClass swift = new CarClass(4,4,120, "Swift",
                "SW876", "Maruthi" );
        //System.out.println(swift.toString());
        System.out.println(swift);
    }
}
