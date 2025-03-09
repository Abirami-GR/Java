package in.kgcoding.Challenge102;

public class TrafficSignal implements Runnable{

    private final SignalColor signalColor;

    public TrafficSignal(SignalColor signalColor) {
        this.signalColor = signalColor;
    }

    @Override
    public synchronized void run() {
        System.out.printf("%s Active\n", signalColor);
        try {
            Thread.sleep(signalColor.getOnTimeInMillis());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("%s Inactive\n", signalColor);
    }
}
