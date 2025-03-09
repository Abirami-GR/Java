package in.kgcoding.Challenge103;

public class SingleThreadedExecutor implements Runnable{
    private final char charName;

    public SingleThreadedExecutor(char charName) {
        this.charName = charName;
    }

    @Override
    public void run() {

            String threadName = Thread.currentThread().getName();
            for (int i = 1; i < 11; i++) {
                System.out.printf("%d:%c, %s\n", i, charName, threadName);
            }

    }
}
