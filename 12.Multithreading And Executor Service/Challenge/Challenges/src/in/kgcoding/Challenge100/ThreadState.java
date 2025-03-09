package in.kgcoding.Challenge100;

public class ThreadState extends Thread{

    @Override
    public void run() {
        try {
            Thread.sleep(4000);
            System.out.printf("From Inside run: %s\n", getState());
        } catch (InterruptedException e) {
            throw new RuntimeException(e); //not a checked exception so no need to handle
        }
    }
}
