package in.kgcoding;

public class Car {
    public String color;
    public String model;
    private double fuelLevel;
    long costOfPurchase;

    public Car(){

    }
    public Car(String color, String model, double fuelLevel, long costOfPurchase) {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.costOfPurchase = costOfPurchase;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car {");
        sb.append("\ncolor = '").append(color).append('\'');
        sb.append(",\n model = '").append(model).append('\'');
        sb.append(",\n fuelLevel = ").append(fuelLevel);
        sb.append(",\n costOfPurchase = ").append(costOfPurchase).append("\n");
        sb.append('}');
        return sb.toString();
    }
}
