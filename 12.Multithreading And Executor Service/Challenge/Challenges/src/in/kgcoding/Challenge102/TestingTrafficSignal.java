package in.kgcoding.Challenge102;

public class TestingTrafficSignal {
    public static void main(String[] args) {
         TrafficSignal red = new TrafficSignal(SignalColor.RED);
         TrafficSignal yellow = new TrafficSignal(SignalColor.YELLOW);
         TrafficSignal green = new TrafficSignal(SignalColor.GREEN);

         Thread t1 = new Thread(red);
         Thread t2 = new Thread(yellow);
         Thread t3 = new Thread(green);

         try {
             t3.start();
             t3.join();
             t2.start();
             t2.join();
             t1.start();
         } catch (InterruptedException e) {
             throw new RuntimeException(e);
         }
    }
}
