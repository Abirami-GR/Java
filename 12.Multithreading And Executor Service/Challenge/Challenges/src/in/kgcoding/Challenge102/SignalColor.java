package in.kgcoding.Challenge102;

public enum SignalColor {
    RED(9000),
    YELLOW(1000),
    GREEN(3000);

    private final int onTimeInMillis;

    SignalColor(int onTimeInMillis) {
        this.onTimeInMillis = onTimeInMillis;
    }

    public int getOnTimeInMillis() {
        return onTimeInMillis;
    }
}
