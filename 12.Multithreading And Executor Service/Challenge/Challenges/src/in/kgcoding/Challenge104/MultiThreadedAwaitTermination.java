package in.kgcoding.Challenge104;

public class MultiThreadedAwaitTermination implements Runnable{

    private final char charName;

    public MultiThreadedAwaitTermination(char charName) {
        this.charName = charName;
    }

    @Override
    public void run() {
        Thread current = Thread.currentThread();
        int sleepTime = getRandom() * 1000;
        System.out.printf("\nThread Name: %s started\n SleepTime: %d\n CharName: %c",
                current.getName(), sleepTime , charName);
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.printf("\n%s Ended", current.getName());
    }

    private int getRandom(){
        double random = Math.random() * 5 + 1;
        return (int) random;
    }
}
