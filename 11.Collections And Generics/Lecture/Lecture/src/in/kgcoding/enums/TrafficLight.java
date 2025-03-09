package in.kgcoding.enums;

public enum TrafficLight {
    RED("Stop"), GREEN("Go"), YELLOW("Caution");

    private final String action;

    public String getAction() {
        return action;
    }

    TrafficLight(String action) {
        this.action = action;
    }
}
